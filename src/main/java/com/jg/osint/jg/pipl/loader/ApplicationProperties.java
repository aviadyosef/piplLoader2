package com.jg.osint.jg.pipl.loader;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ApplicationProperties {


    @Value("${pipl-json-file-path}")
    private String piplJsonFilePath = "NA";
    @Value("${delete-old-data}")
    private boolean deleteOldData = false;
    private boolean readPiplJsonFile = true;
    private int piplBatchSize = 2000;

//    @Value("${us-db-csv-folder-path}")
    private String usDbCsvFolderPath = "NA";

    private boolean deleteUsDbCsvOldData = false;
    private boolean readUsDbCsvFile = true;
    private int usDbCsvBatchSize = 2000;


    public ApplicationProperties() {}

    public int getPiplBatchSize() {
        return piplBatchSize;
    }

    public void setPiplBatchSize(int piplBatchSize) {
        this.piplBatchSize = piplBatchSize;
    }

    public boolean isReadPiplJsonFile() {
        return readPiplJsonFile;
    }

    public String getPiplJsonFilePath() {
        return piplJsonFilePath;
    }

    public void setPiplJsonFilePath(String piplJsonFilePath) {
        this.piplJsonFilePath = piplJsonFilePath;
    }

    public boolean isDeleteOldData() {
        return deleteOldData;
    }

    public void setDeleteOldData(boolean deleteOldData) {
        this.deleteOldData = deleteOldData;
    }

    public void setReadPiplJsonFile(boolean readPiplJsonFile) {
        this.readPiplJsonFile = readPiplJsonFile;
    }

    public String getUsDbCsvFolderPath() {
        return usDbCsvFolderPath;
    }

    public void setUsDbCsvFolderPath(String usDbCsvFolderPath) {
        this.usDbCsvFolderPath = usDbCsvFolderPath;
    }

    public boolean isDeleteUsDbCsvOldData() {
        return deleteUsDbCsvOldData;
    }

    public void setDeleteUsDbCsvOldData(boolean deleteUsDbCsvOldData) {
        this.deleteUsDbCsvOldData = deleteUsDbCsvOldData;
    }

    public boolean isReadUsDbCsvFile() {
        return readUsDbCsvFile;
    }

    public void setReadUsDbCsvFile(boolean readUsDbCsvFile) {
        this.readUsDbCsvFile = readUsDbCsvFile;
    }

    public int getUsDbCsvBatchSize() {
        return usDbCsvBatchSize;
    }

    public void setUsDbCsvBatchSize(int usDbCsvBatchSize) {
        this.usDbCsvBatchSize = usDbCsvBatchSize;
    }
}
