package com.jg.osint.jg.pipl.loader.service;

import com.google.gson.Gson;
import com.jg.osint.jg.pipl.loader.ApplicationProperties;
import com.jg.osint.jg.pipl.loader.domain.PiplJob;
import com.jg.osint.jg.pipl.loader.domain.PiplPerson;
import com.jg.osint.jg.pipl.loader.domain.PiplSocialUrl;
import com.jg.osint.jg.pipl.loader.domain.UsDbOne;
import com.jg.osint.jg.pipl.loader.json.PiplPersonJson;
import com.jg.osint.jg.pipl.loader.repository.PiplJobRepository;
import com.jg.osint.jg.pipl.loader.repository.PiplPersonRepository;
import com.jg.osint.jg.pipl.loader.repository.PiplSocialUrlRepository;
import com.jg.osint.jg.pipl.loader.repository.UsDbOneRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StopWatch;

import javax.annotation.PostConstruct;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
@Transactional
public class PersonService {

    private static final Logger log = LoggerFactory.getLogger(PersonService.class);

    private final PiplPersonRepository piplPersonRepository;
    private final PiplSocialUrlRepository piplSocialUrlRepository;
    private final PiplJobRepository piplJobRepository;

    private final UsDbOneRepository usDbOneRepository;

    private final ApplicationProperties applicationProperties;



    private StopWatch stopWatch;
    private int batchSize = 2000;

    public PersonService(
        PiplPersonRepository piplPersonRepository,
        PiplSocialUrlRepository piplSocialUrlRepository,
        PiplJobRepository piplJobRepository,
        UsDbOneRepository usDbOneRepository,
        ApplicationProperties applicationProperties
    ) {
        this.piplPersonRepository       = piplPersonRepository;
        this.piplSocialUrlRepository    = piplSocialUrlRepository;
        this.piplJobRepository          = piplJobRepository;

        this.usDbOneRepository          = usDbOneRepository;

        this.applicationProperties = applicationProperties;

        batchSize = applicationProperties.getPiplBatchSize();

        stopWatch = new StopWatch("personServiceExecution");
        deleteOldDataIfNeededPipl();
//        deleteOldDataIfNeededUsDb();
    }

    @PostConstruct
    public void init() throws IOException {
        readLargeJson(applicationProperties.isReadPiplJsonFile(), applicationProperties.getPiplJsonFilePath());

//        readLargeCsv(applicationProperties.isReadUsDbCsvFile(), applicationProperties.getUsDbCsvFolderPath());
    }

    public void readLargeCsv(boolean isOn, String folderPath) throws IOException {
        int i = 0;

        if (!isOn) {
            log.info("Config was set Not to loading usDB csv file.");
            return;
        }

        File folder = new File(folderPath);
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                processCsvFile(file.getAbsolutePath(), i);

            }
        }

    }

    private void processCsvFile(String filePath, int i) throws IOException {
        log.info("was able to read us_db csv input=" + filePath);

        InputStream inputStream = Files.newInputStream(Path.of(filePath));

        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            stopWatch.start("reading us_db data-" + i);
            List<UsDbOne> usDbPersonList = new ArrayList<>();

            while ((line = br.readLine()) != null) {
                if (i == 0) {
                    i++;
                    continue;
                }
                try {
                    ConvertPeopleToDbObject convertPeopleToDbObject = new ConvertPeopleToDbObject();
                    UsDbOne usDbOne = convertPeopleToDbObject.fromCsvToUsDb(line);
                    usDbPersonList.add(usDbOne);

                    if (i % batchSize == 0) {
                        saveAllUsDbPerson(usDbPersonList);

                        stopWatch.stop();
                        log.info("#" + ((i / batchSize) + 1) + "# lastTaskTime in Millis=" + stopWatch.getLastTaskTimeMillis());
                        stopWatch.start("reading data-" + ((i / batchSize) + 1));
                    }

                    i++;
                } catch (Exception e) {
                    log.error("Failed to load person data = " + line, e);
                }
            }
            if (!usDbPersonList.isEmpty()) {
                saveAllUsDbPerson(usDbPersonList);

                stopWatch.stop();
                log.info("#" + ((i / batchSize) + 1) + "# lastTaskTime in Millis=" + stopWatch.getLastTaskTimeMillis());
            }
        }

        log.info("Total Time in min=" + stopWatch.getTotalTimeSeconds() / 60 + "\n");
    }


    public void readLargeJson(boolean isOn, String filePath) throws IOException {
        int i = 0;

        if (!isOn) {
            log.info("Not loading PipJson file.");
            return;
        }

        String path = filePath;
        log.info("was able to read input=" + path);

        InputStream inputStream = Files.newInputStream(Path.of(path));

        try (BufferedReader br = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            stopWatch.start("reading data-" + i);
            List<PiplPerson> piplPersonList = new ArrayList<>();
            List<PiplSocialUrl> piplSocialUrlList = new ArrayList<>();
            List<PiplJob> piplJobList = new ArrayList<>();

            while ((line = br.readLine()) != null) {
                try {
                    PiplPersonJson piplPersonJson = new Gson().fromJson(line, PiplPersonJson.class);
                    log.info(i + "# = " + piplPersonJson.toString());
                    PiplPerson piplPerson = ConvertPeopleToDbObject.fromPiplJsonToPiplDb(piplPersonJson);
                    piplPersonList.add(piplPerson);

                    Set<PiplSocialUrl> socialUrls = piplPerson.getSocialUrls();
                    for (PiplSocialUrl socialUrl : socialUrls) {
                        piplSocialUrlList.add(socialUrl);
                    }

                    Set<PiplJob> jobs = piplPerson.getJobs();
                    for (PiplJob job : jobs) {
                        piplJobList.add(job);
                    }

                    if (i % batchSize == 0) {
                        saveAll(piplPersonList, piplSocialUrlList, piplJobList);

                        stopWatch.stop();
                        log.info("#" + ((i / batchSize) + 1) + "# lastTaskTime in Millis=" + stopWatch.getLastTaskTimeMillis());
                        stopWatch.start("reading data-" + ((i / batchSize) + 1));
                    }

                    i++;
                } catch (Exception e) {
                    log.error("Failed to load person data = " + line, e);
                }
            }

            if (!piplPersonList.isEmpty()) {
                saveAll(piplPersonList, piplSocialUrlList, piplJobList);

                stopWatch.stop();
                log.info("#" + ((i / batchSize) + 1) + "# lastTaskTime in Millis=" + stopWatch.getLastTaskTimeMillis());
            }
        }

        log.info("Total Time in min=" + stopWatch.getTotalTimeSeconds() / 60 + "\n");
    }

    private void saveAll(List<PiplPerson> piplPersonList, List<PiplSocialUrl> piplSocialUrlList, List<PiplJob> piplJobs) {
        piplPersonRepository.saveAll(piplPersonList);
//        piplPersonSearchRepository.saveAll(piplPersonList);

        piplSocialUrlRepository.saveAll(piplSocialUrlList);
        piplJobRepository.saveAll(piplJobs);

        piplPersonList.clear();
        piplSocialUrlList.clear();
        piplJobs.clear();
    }

    private void saveAllUsDbPerson(List<UsDbOne> usDbOneList) {
        usDbOneRepository.saveAll(usDbOneList);

        usDbOneList.clear();
    }

    private void deleteOldDataIfNeededPipl() {
        if (applicationProperties.isDeleteOldData()) {
            log.info("delete old pipl data started..");
            piplSocialUrlRepository.deleteAll();
            piplJobRepository.deleteAll();

            piplPersonRepository.deleteAll();

            log.info("delete old pipl data end.");
        }
    }

    private void deleteOldDataIfNeededUsDb() {
        if (applicationProperties.isDeleteUsDbCsvOldData()) {
            log.info("delete old US_DB data started..");
            usDbOneRepository.deleteAll();
            log.info("delete old IS_DB data end.");
        }
    }


}
