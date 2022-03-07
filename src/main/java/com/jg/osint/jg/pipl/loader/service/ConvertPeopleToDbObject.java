package com.jg.osint.jg.pipl.loader.service;

import com.jg.osint.jg.pipl.loader.domain.PiplJob;
import com.jg.osint.jg.pipl.loader.domain.PiplPerson;
import com.jg.osint.jg.pipl.loader.domain.PiplSocialUrl;
import com.jg.osint.jg.pipl.loader.domain.UsDbOne;
import com.jg.osint.jg.pipl.loader.domain.csv.PersonUsDbCsv;
import com.jg.osint.jg.pipl.loader.json.Job;
import com.jg.osint.jg.pipl.loader.json.PiplPersonJson;
import com.jg.osint.jg.pipl.loader.json.SocialUrl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertPeopleToDbObject {

    private static final Logger log = LoggerFactory.getLogger(ConvertPeopleToDbObject.class);

    public static PiplPerson fromPiplJsonToPiplDb(PiplPersonJson ppJson) {

        Set<PiplSocialUrl> piplSocialUrlSet = getPiplSocialUrls(ppJson);

        Set<PiplJob> piplJobSet = getPiplJobs(ppJson);

        PiplPerson piplPerson = new PiplPerson()
            .firstName(ppJson.getFirstName())
            .middleName(ppJson.getMiddleName())
            .lastName(ppJson.getLastName())
            .akaNamesList(ppJson.getAkaListAsString())
            .piplUid(ppJson.getId())
            .pipleOid(ppJson.get_id().getOid())
            .emailList(ppJson.getEmailAsString())
            .phoneNumber(ppJson.getPhoneNumber())
            .gender(ppJson.getGender())
            .race(ppJson.getRace())
            .politicalParty(ppJson.getPoliticalParty())
            .birthday(ppJson.getBdayAsInstant())
            .locations(ppJson.getLocationsAsString())
            .hometown(ppJson.getCity())
            .lastUpdate(ppJson.getLastUpdate())
            .piplCreationTime(ppJson.getPiplCreationTime())
            .autos(ppJson.getAutosAsString())
            .education(ppJson.getEducation() == null ? null : ppJson.getEducation().toString())
            .socialUrls(piplSocialUrlSet)
            .jobs(piplJobSet)
            ;

        return piplPerson;
    }

    private static Set<PiplSocialUrl> getPiplSocialUrls(PiplPersonJson ppJson) {
        List<SocialUrl> socialUrlsList = ppJson.getSocialUrlsList();
        if (socialUrlsList == null || socialUrlsList.isEmpty()) {
            // Add empty data row anyway..
            PiplSocialUrl piplSocialUrl = new PiplSocialUrl();
            piplSocialUrl.setDataSource("NA");
            piplSocialUrl.setDomain("NA");
            piplSocialUrl.setName("NA");
            piplSocialUrl.setUrl("NA");

            Set<PiplSocialUrl> piplSocialUrlSet = new HashSet<>();
            piplSocialUrlSet.add(piplSocialUrl);
            return piplSocialUrlSet;
        }

        Set<PiplSocialUrl> piplSocialUrlSet = new HashSet<>();
        for (SocialUrl socialUrl : socialUrlsList) {
            PiplSocialUrl piplSocialUrl = new PiplSocialUrl();
            piplSocialUrl.setDataSource(socialUrl.getDataSource());
            piplSocialUrl.setDomain(socialUrl.getDomain());
            piplSocialUrl.setName(socialUrl.getName());
            piplSocialUrl.setUrl(socialUrl.getUrl());

            piplSocialUrlSet.add(piplSocialUrl);
        }
        return piplSocialUrlSet;
    }

    private static Set<PiplJob> getPiplJobs(PiplPersonJson ppJson) {
        List<Job> jsonJobs = ppJson.getJobs();
        if (jsonJobs == null || jsonJobs.isEmpty()) {
            PiplJob piplJob = new PiplJob();

            piplJob.setCompany  ("NA");
            piplJob.setTitle    ("NA");
            piplJob.setStartYear("NA");
            piplJob.setEndYear  ("NA");

            Set<PiplJob> piplJobSet = new HashSet<>();
            piplJobSet.add(piplJob);

            return piplJobSet;
        }

        Set<PiplJob> piplJobSet = new HashSet<>();
        for (Job jsonJob : jsonJobs) {
            PiplJob piplJob = new PiplJob();

            piplJob.setCompany(jsonJob.getCompany());
            piplJob.setTitle  (jsonJob.getTitle());

            if (jsonJob.getJobDate() != null) {
                piplJob.setStartYear(jsonJob.getJobDate().getStartYear());
                piplJob.setEndYear  (jsonJob.getJobDate().getEndYear());
            }

            piplJobSet.add(piplJob);
        }
        return piplJobSet;
    }

    public UsDbOne fromCsvToUsDb(String csvLine) throws Exception {
        PersonUsDbCsv personUsDbCsv = new PersonUsDbCsv();
        CsvParseLineHelper csvParseLineHelper = new CsvParseLineHelper();
        String[] splitByComma = csvParseLineHelper.parseLine(csvLine);
        int totalNumOfCol = splitByComma.length;

        personUsDbCsv.setHHID                   (extractColValue(splitByComma, 0, totalNumOfCol));
        personUsDbCsv.setID                     (extractColValue(splitByComma, 1, totalNumOfCol));
        personUsDbCsv.setFirstName01            (extractColValue(splitByComma, 2, totalNumOfCol));
        personUsDbCsv.setAlphafirstnamesort     (extractColValue(splitByComma, 3, totalNumOfCol));
        personUsDbCsv.setPhoneticFirstName      (extractColValue(splitByComma, 4, totalNumOfCol));
        personUsDbCsv.setMiddleName01           (extractColValue(splitByComma, 5, totalNumOfCol));
        personUsDbCsv.setLastName01             (extractColValue(splitByComma, 6, totalNumOfCol));
        personUsDbCsv.setAlphalastnamesort      (extractColValue(splitByComma, 7, totalNumOfCol));
        personUsDbCsv.setPhoneticLastName       (extractColValue(splitByComma, 8, totalNumOfCol));
        personUsDbCsv.setAddress                (extractColValue(splitByComma, 9, totalNumOfCol));
        personUsDbCsv.setAlphaaddresssort       (extractColValue(splitByComma, 10, totalNumOfCol));
        personUsDbCsv.setCity                   (extractColValue(splitByComma, 11, totalNumOfCol));
        personUsDbCsv.setCITYPHRASE             (extractColValue(splitByComma, 12, totalNumOfCol));
        personUsDbCsv.setAlphacitysort          (extractColValue(splitByComma, 13, totalNumOfCol));
        personUsDbCsv.setCities                 (extractColValue(splitByComma, 14, totalNumOfCol));
        personUsDbCsv.setState                  (extractColValue(splitByComma, 15, totalNumOfCol));
        personUsDbCsv.setAlphastatesort         (extractColValue(splitByComma, 16, totalNumOfCol));
        personUsDbCsv.setZIP                    (extractColValue(splitByComma, 17, totalNumOfCol));
        personUsDbCsv.setZIP4                   (extractColValue(splitByComma, 18, totalNumOfCol));
        personUsDbCsv.setCarrierRoute           (extractColValue(splitByComma, 19, totalNumOfCol));
        personUsDbCsv.setDeliveryPoint          (extractColValue(splitByComma, 20, totalNumOfCol));
        personUsDbCsv.setMailScoreCode          (extractColValue(splitByComma, 21, totalNumOfCol));
        personUsDbCsv.setGeoLevelCode           (extractColValue(splitByComma, 22, totalNumOfCol));
        personUsDbCsv.setLatitude               (extractColValue(splitByComma, 23, totalNumOfCol));
        personUsDbCsv.setLongitude              (extractColValue(splitByComma, 24, totalNumOfCol));
        personUsDbCsv.setTimeZoneCode           (extractColValue(splitByComma, 25, totalNumOfCol));
        personUsDbCsv.setCountyCode             (extractColValue(splitByComma, 26, totalNumOfCol));
        personUsDbCsv.setCountyDescription      (extractColValue(splitByComma, 27, totalNumOfCol));
        personUsDbCsv.setcBSACode               (extractColValue(splitByComma, 28, totalNumOfCol));
        personUsDbCsv.setcBSADescription        (extractColValue(splitByComma, 29, totalNumOfCol));
        personUsDbCsv.setScrubbedPhoneableFlag  (extractColValue(splitByComma, 30, totalNumOfCol));
        personUsDbCsv.setIndGenderCode          (extractColValue(splitByComma, 31, totalNumOfCol));
        personUsDbCsv.setIndHouseholdRankCode   (extractColValue(splitByComma, 36, totalNumOfCol));
        personUsDbCsv.setIndEthnicCode          (extractColValue(splitByComma, 37, totalNumOfCol));
        personUsDbCsv.setIndPoliticalPartyCode  (extractColValue(splitByComma, 38, totalNumOfCol));
        personUsDbCsv.setHomeValueCode          (extractColValue(splitByComma, 39, totalNumOfCol));
        personUsDbCsv.setHomeValueDescription   (extractColValue(splitByComma, 40, totalNumOfCol));
        personUsDbCsv.setHomeMedianValueCode    (extractColValue(splitByComma, 41, totalNumOfCol));
        personUsDbCsv.setHomeMedianValueDescription(extractColValue(splitByComma, 42, totalNumOfCol));
        personUsDbCsv.setMedianIncomeCode       (extractColValue(splitByComma, 51, totalNumOfCol));
        personUsDbCsv.setMedianIncomeDescription(extractColValue(splitByComma, 52, totalNumOfCol));
        personUsDbCsv.setIncomeCode             (extractColValue(splitByComma, 53, totalNumOfCol));
        personUsDbCsv.setIncomeDescription      (extractColValue(splitByComma, 54, totalNumOfCol));
        personUsDbCsv.setDonorCapacityCode      (extractColValue(splitByComma, 64, totalNumOfCol));
        personUsDbCsv.setDeliveryPointCheckDigit(extractColValue(splitByComma, 130, totalNumOfCol));
        personUsDbCsv.setAddressNumber          (extractColValue(splitByComma, 131, totalNumOfCol));
        personUsDbCsv.setStreetName             (extractColValue(splitByComma, 132, totalNumOfCol));
        personUsDbCsv.setStreetSuffix           (extractColValue(splitByComma, 133, totalNumOfCol));
        personUsDbCsv.setStateCity              (extractColValue(splitByComma, 134, totalNumOfCol));
        personUsDbCsv.setAddressID              (extractColValue(splitByComma, 135, totalNumOfCol));
        personUsDbCsv.setpOFlag                 (extractColValue(splitByComma, 136, totalNumOfCol));
        personUsDbCsv.setMailableFlag           (extractColValue(splitByComma, 137, totalNumOfCol));
        personUsDbCsv.setLocationUniqueFlag     (extractColValue(splitByComma, 138, totalNumOfCol));
        personUsDbCsv.setProductionDate         (extractColValue(splitByComma, 141, totalNumOfCol));
        personUsDbCsv.setLatLong                (extractColValue(splitByComma, 143, totalNumOfCol));
        personUsDbCsv.setGeoLatLong             (extractColValue(splitByComma, 144, totalNumOfCol));
        personUsDbCsv.setMarketing              (extractColValue(splitByComma, 145, totalNumOfCol));
        personUsDbCsv.setMailable               (extractColValue(splitByComma, 146, totalNumOfCol));
        personUsDbCsv.setPhoneable              (extractColValue(splitByComma, 147, totalNumOfCol));
        personUsDbCsv.setMailablePhoneable      (extractColValue(splitByComma, 148, totalNumOfCol));
        personUsDbCsv.setzIP9                   (extractColValue(splitByComma, 149, totalNumOfCol));
        personUsDbCsv.setZip11                  (extractColValue(splitByComma, 150, totalNumOfCol));
        personUsDbCsv.setZip4Exists             (extractColValue(splitByComma, 151, totalNumOfCol));
        personUsDbCsv.setAddressMaster          (extractColValue(splitByComma, 152, totalNumOfCol));
        personUsDbCsv.setlSGreenLivingFlag      (extractColValue(splitByComma, 153, totalNumOfCol));
        personUsDbCsv.setVersion                (extractColValue(splitByComma, 154, totalNumOfCol));
        personUsDbCsv.setLatLong0coordinate     (extractColValue(splitByComma, 155, totalNumOfCol));
        personUsDbCsv.setLatLong1coordinate     (extractColValue(splitByComma, 156, totalNumOfCol));
        personUsDbCsv.setPreDirection           (extractColValue(splitByComma, 254, totalNumOfCol));
        personUsDbCsv.setHomeDwellingTypeCode   (extractColValue(splitByComma, 50, totalNumOfCol));
        personUsDbCsv.setSecondaryName          (extractColValue(splitByComma, 223, totalNumOfCol));
        personUsDbCsv.setSecondaryNumber        (extractColValue(splitByComma, 224, totalNumOfCol));
        personUsDbCsv.setPostDirection          (extractColValue(splitByComma, 261, totalNumOfCol));
        personUsDbCsv.setNumberofBedrooms       (extractColValue(splitByComma, 185, totalNumOfCol));
        personUsDbCsv.setNumberofBathrooms      (extractColValue(splitByComma, 186, totalNumOfCol));
        personUsDbCsv.setHomePropertyTypeCode02 (extractColValue(splitByComma, 206, totalNumOfCol));
        personUsDbCsv.setHomeSquareFootage      (extractColValue(splitByComma, 159, totalNumOfCol));
        personUsDbCsv.setHomeSquareFootageCode  (extractColValue(splitByComma, 160, totalNumOfCol));
        personUsDbCsv.setEmailPresentFlag       (extractColValue(splitByComma, 157, totalNumOfCol));
        personUsDbCsv.setEmail                  (extractColValue(splitByComma, 158, totalNumOfCol));
        personUsDbCsv.setEmail02                (extractColValue(splitByComma, 233, totalNumOfCol));



        log.debug("# = " + personUsDbCsv.toString());


        UsDbOne usDbOne = new UsDbOne();
        usDbOne.setIdUsDbOne                      (personUsDbCsv.getID());
        usDbOne.setFirstName01                    (personUsDbCsv.getFirstName01());
        usDbOne.setAlphafirstnameSort              (personUsDbCsv.getAlphafirstnamesort     ());
        usDbOne.setPhoneticFirstName               (personUsDbCsv.getPhoneticFirstName      ());
        usDbOne.setLastName01Varchar               (personUsDbCsv.getLastName01             ());
        usDbOne.setAlphalastnameSort               (personUsDbCsv.getAlphalastnamesort      ());
        usDbOne.setPhoneticLastName                (personUsDbCsv.getPhoneticLastName       ());
        usDbOne.setAddress                         (personUsDbCsv.getAddress                ());
        usDbOne.setAlphaaddressSort                (personUsDbCsv.getAlphafirstnamesort     ());
        usDbOne.setCity                            (personUsDbCsv.getCity                   ());
        usDbOne.setCityPhrase                      (personUsDbCsv.getCITYPHRASE             ());
        usDbOne.setAlphacitySort                   (personUsDbCsv.getAlphacitysort          ());
        usDbOne.setCities                          (personUsDbCsv.getCities                 ());
        usDbOne.setState                           (personUsDbCsv.getState                  ());
        usDbOne.setAlphastateSort                  (personUsDbCsv.getAlphastatesort         ());
        usDbOne.setZip                             (personUsDbCsv.getZIP                    ());
        usDbOne.setZip4                            (personUsDbCsv.getZIP4                   ());
        usDbOne.setCarrierRoute                    (personUsDbCsv.getCarrierRoute           ());
        usDbOne.setDeliveryPoint                   (personUsDbCsv.getDeliveryPoint          ());
        usDbOne.setMailScoreCode                   (personUsDbCsv.getMailScoreCode          ());
        usDbOne.setGeoLevelCode                    (personUsDbCsv.getGeoLevelCode           ());
        usDbOne.setLatitude                        (personUsDbCsv.getLatitude               ());
        usDbOne.setLongitude                       (personUsDbCsv.getLongitude              ());
        usDbOne.setTimeZoneCode                    (personUsDbCsv.getTimeZoneCode           ());
        usDbOne.setCountyCode                      (personUsDbCsv.getCountyCode             ());
        usDbOne.setCountyDescription               (personUsDbCsv.getCountyDescription      ());
        usDbOne.setCbsaCode                        (personUsDbCsv.getcBSACode               ());
        usDbOne.setCbsaDescription                 (personUsDbCsv.getcBSADescription        ());
        usDbOne.setScrubbedPhoneableFlag           (personUsDbCsv.getScrubbedPhoneableFlag  ());
        usDbOne.setIndGenderCode                   (personUsDbCsv.getIndGenderCode          ());
        usDbOne.setIndHouseholdRankCode            (personUsDbCsv.getIndHouseholdRankCode   ());
        usDbOne.setIndEthnicCode                   (personUsDbCsv.getIndEthnicCode          ());
        usDbOne.setIndPoliticalPartyCode           (personUsDbCsv.getIndPoliticalPartyCode  ());
        usDbOne.setHomeValueCode                   (personUsDbCsv.getHomeValueCode          ());
        usDbOne.setHomeValueDescription            (personUsDbCsv.getHomeValueDescription   ());
        usDbOne.setHomeMedianValueCode             (personUsDbCsv.getHomeMedianValueCode    ());
        usDbOne.setHomeMedianValueDescription      (personUsDbCsv.getHomeMedianValueDescription());
        usDbOne.setMedianIncomeCode                (personUsDbCsv.getMedianIncomeCode       ());
        usDbOne.setMedianIncomeDescription         (personUsDbCsv.getMedianIncomeDescription());
        usDbOne.setIncomeCode                      (personUsDbCsv.getIncomeCode             ());
        usDbOne.setIncomeDescription               (personUsDbCsv.getIncomeDescription      ());
        usDbOne.setDonorCapacityCode               (personUsDbCsv.getDonorCapacityCode      ());
        usDbOne.setDeliveryPointCheckdigit         (personUsDbCsv.getDeliveryPointCheckDigit());
        usDbOne.setAddressNumber                   (personUsDbCsv.getAddressNumber          ());
        usDbOne.setStreetName                      (personUsDbCsv.getStreetName             ());
        usDbOne.setStreetSuffix                    (personUsDbCsv.getStreetSuffix           ());
        usDbOne.setStateCity                       (personUsDbCsv.getStateCity              ());
        usDbOne.setAddressId                       (personUsDbCsv.getAddressID              ());
        usDbOne.setPoFlag                          (personUsDbCsv.getpOFlag                 ());
        usDbOne.setMailableFlag                    (personUsDbCsv.getMailableFlag           ());
        usDbOne.setLocationUniqueFlag              (personUsDbCsv.getLocationUniqueFlag     ());
        usDbOne.setProductiondate                  (personUsDbCsv.getProductionDate         ());
        usDbOne.setLatLong                         (personUsDbCsv.getLatLong                ());
        usDbOne.setGeoLatLong                      (personUsDbCsv.getGeoLatLong             ());
        usDbOne.setMarketing                       (personUsDbCsv.getMarketing              ());
        usDbOne.setMailable                        (personUsDbCsv.getMailable               ());
        usDbOne.setPhoneable                       (personUsDbCsv.getPhoneable              ());
        usDbOne.setMailablePhoneable               (personUsDbCsv.getMailablePhoneable      ());
        usDbOne.setZip9                            (personUsDbCsv.getzIP9                   ());
        usDbOne.setZip11                           (personUsDbCsv.getZip11                  ());
        usDbOne.setZip4exists                      (personUsDbCsv.getZip4Exists             ());
        usDbOne.setAddressMaster                   (personUsDbCsv.getAddressMaster          ());
        usDbOne.setLsGreenLivingFlag               (personUsDbCsv.getlSGreenLivingFlag      ());
        usDbOne.setVersionNum                      (personUsDbCsv.getVersion                ());
        usDbOne.setLatLong0Coordinate              (personUsDbCsv.getLatLong0coordinate     ());
        usDbOne.setLatLong1Coordinate              (personUsDbCsv.getLatLong1coordinate     ());
        usDbOne.setPreDirection                    (personUsDbCsv.getPreDirection           ());
        usDbOne.setHomeDwellingTypeCode            (personUsDbCsv.getHomeDwellingTypeCode   ());
        usDbOne.setSecondaryName                   (personUsDbCsv.getSecondaryName          ());
        usDbOne.setSecondaryNumber                 (personUsDbCsv.getSecondaryNumber        ());
        usDbOne.setPostDirection                   (personUsDbCsv.getPostDirection          ());
        usDbOne.setNumberOfBedrooms                (personUsDbCsv.getNumberofBedrooms       ());
        usDbOne.setNumberOfBathrooms               (personUsDbCsv.getNumberofBathrooms      ());
        usDbOne.setHomePropertyTypeCode02          (personUsDbCsv.getHomePropertyTypeCode02 ());
        usDbOne.setHomeSquareFootage               (personUsDbCsv.getHomeSquareFootage      ());
        usDbOne.setHomeSquareFootageCode           (personUsDbCsv.getHomeSquareFootageCode  ());
        usDbOne.setEmailPresentFlag                (personUsDbCsv.getEmailPresentFlag       ());
        usDbOne.setEmail                           (personUsDbCsv.getEmail                  ());
        usDbOne.setEmail02                         (personUsDbCsv.getEmail02                ());

        log.debug("#US_DB = " + usDbOne.toString());

        return usDbOne;
    }

    private static String extractColValue(String[] splitByComma, int i, int totalNumOfCol) {
        if (i < totalNumOfCol - 1) {
            return splitByComma[i];
        }

        return null;
    }



}
