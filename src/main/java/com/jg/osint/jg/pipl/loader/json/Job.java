package com.jg.osint.jg.pipl.loader.json;

import com.google.gson.annotations.SerializedName;

public class Job {

    private String company;

    @SerializedName(value = "dates", alternate = "jobDate")
    private JobDate jobDate;

    private String title;


    public String getCompany() {
        return company;
    }

    public JobDate getJobDate() {
        return jobDate;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Job{" + "company='" + company + '\'' + ", jobDate=" + jobDate + ", title='" + title + '\'' + '}';
    }
}
