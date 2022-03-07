package com.jg.osint.jg.pipl.loader.json;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

/**
 * A PiplPerson.
 */
public class PiplPersonJson implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private int maxColSize = 254;

    @SerializedName(value = "firstname", alternate = "firstName")
    private String firstName;

    @SerializedName(value = "middlename", alternate = "middleName")
    private String middleName;

    @SerializedName(value = "lastname", alternate = "lastName")
    private String lastName;

    @SerializedName(value = "aka", alternate = "akaNamesList")
    private List<Aka> akaNamesList;

    private String street;

    private String city;

    private String state;

    private String zip;

    private PiplId _id;

    private List<String> emailList;

    @SerializedName(value = "phone", alternate = "phoneNumber")
    private String phoneNumber;

    private String gender;

    private String race;

    private String politicalParty;

    @SerializedName(value = "dateOfBirth", alternate = "birthday")
    private String birthday;

    private String locations;

    private String hometown;

    private String piplCreationTime;

    private Long salary;

    private List<Job> jobs;

    @SerializedName(value = "dateUpdated", alternate = "lastUpdate")
    private String lastUpdate;

    @SerializedName(value = "autos")
    private List<Automobile> autos;

    private Education education;

    @SerializedName(value = "socialUrls", alternate = "socialUrlsList")
    private List<SocialUrl> socialUrlsList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Aka> getAkaNamesList() {
        return akaNamesList;
    }

    public void setAkaNamesList(List<Aka> akaNamesList) {
        this.akaNamesList = akaNamesList;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public PiplId get_id() {
        return _id;
    }

    public void set_id(PiplId _id) {
        this._id = _id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        this.politicalParty = politicalParty;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getPiplCreationTime() {
        return piplCreationTime;
    }

    public void setPiplCreationTime(String piplCreationTime) {
        this.piplCreationTime = piplCreationTime;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public List<String> getEmailList() {
        return emailList;
    }

    public void setEmailList(List<String> emailList) {
        this.emailList = emailList;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public List<Automobile> getAutos() {
        return autos;
    }

    public void setAutos(List<Automobile> autos) {
        this.autos = autos;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public List<SocialUrl> getSocialUrlsList() {
        return socialUrlsList;
    }

    public void setSocialUrlsList(List<SocialUrl> socialUrlsList) {
        this.socialUrlsList = socialUrlsList;
    }

    @Override
    public String toString() {
        return (
            "PiplPersonJson{" +
            "id='" +
            id +
            '\'' +
            ", firstName='" +
            firstName +
            '\'' +
            ", middleName='" +
            middleName +
            '\'' +
            ", lastName='" +
            lastName +
            '\'' +
            ", akaNamesList=" +
            akaNamesList +
            ", street='" +
            street +
            '\'' +
            ", city='" +
            city +
            '\'' +
            ", state='" +
            state +
            '\'' +
            ", zip='" +
            zip +
            '\'' +
            ", _id=" +
            _id +
            ", emailList=" +
            emailList +
            ", phoneNumber='" +
            phoneNumber +
            '\'' +
            ", gender='" +
            gender +
            '\'' +
            ", race='" +
            race +
            '\'' +
            ", politicalParty='" +
            politicalParty +
            '\'' +
            ", birthday='" +
            birthday +
            '\'' +
            ", locations='" +
            locations +
            '\'' +
            ", hometown='" +
            hometown +
            '\'' +
            ", piplCreationTime='" +
            piplCreationTime +
            '\'' +
            ", salary=" +
            salary +
            ", jobs=" +
            jobs +
            ", lastUpdate='" +
            lastUpdate +
            '\'' +
            ", autos=" +
            autos +
            ", education=" +
            education +
            ", socialUrlsList=" +
            socialUrlsList +
            '}'
        );
    }

    public String getAkaListAsString() {
        if (akaNamesList == null || akaNamesList.isEmpty()) {
            return null;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (Aka aka : akaNamesList) {
            stringBuilder.append(aka + ", ");
        }

        if (stringBuilder.length() > maxColSize) {
            return stringBuilder.substring(0, maxColSize);
        }

        return stringBuilder.toString();
    }

    public String getEmailAsString() {
        if (emailList == null || emailList.isEmpty()) {
            return null;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (String email : emailList) {
            stringBuilder.append(email + ", ");
        }

        return stringBuilder.toString();
    }

    public Instant getBdayAsInstant() {
        if (birthday != null) {
            LocalDate date = LocalDate.parse(birthday);
            return date.atStartOfDay(ZoneId.systemDefault()).toInstant();
        } else {
            return null;
        }
    }

    public String getLocationsAsString() {
        return city + ", " + street + ", " + state + ", " + zip;
    }

    public String getAutosAsString() {
        if (autos == null || autos.isEmpty()) {
            return null;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (Automobile auto : autos) {
            stringBuilder.append(auto.toString() + ", ");
        }

        if (stringBuilder.length() > maxColSize) {
            return stringBuilder.substring(0, maxColSize);
        }

        return stringBuilder.toString();
    }

    public String getSocialUrlsAsString() {
        if (socialUrlsList == null || socialUrlsList.isEmpty()) {
            return null;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (SocialUrl socialUrl : socialUrlsList) {
            stringBuilder.append(socialUrl.toString() + ", ");
        }

        if (stringBuilder.length() > maxColSize) {
            return stringBuilder.substring(0, maxColSize);
        }

        return stringBuilder.toString();
    }

    public String getJobsAsString() {
        if (jobs == null || jobs.isEmpty()) {
            return null;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (Job job : jobs) {
            stringBuilder.append(job.toString() + ", ");
        }

        if (stringBuilder.length() > maxColSize) {
            return stringBuilder.substring(0, maxColSize);
        }

        return stringBuilder.toString();
    }
}
