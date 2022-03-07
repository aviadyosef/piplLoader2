package com.jg.osint.jg.pipl.loader.json;

public class JobDate {

    private String startYear;
    private String endYear;


    public String getStartYear() {
        return startYear;
    }

    public String getEndYear() {
        return endYear;
    }

    @Override
    public String toString() {
        return "JobDate{" + "startYear='" + startYear + '\'' + ", endYear='" + endYear + '\'' + '}';
    }
}
