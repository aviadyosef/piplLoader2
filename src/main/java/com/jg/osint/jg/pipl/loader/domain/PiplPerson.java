package com.jg.osint.jg.pipl.loader.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

/**
 * A PiplPerson.
 */
@Entity
@Table(name = "pipl_person")
public class PiplPerson implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "aka_names_list")
    private String akaNamesList;

    @Column(name = "pipl_uid")
    private String piplUid;

    @Column(name = "piple_oid")
    private String pipleOid;

    @Column(name = "email_list")
    private String emailList;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "gender")
    private String gender;

    @Column(name = "race")
    private String race;

    @Column(name = "political_party")
    private String politicalParty;

    @Column(name = "birthday")
    private Instant birthday;

    @Column(name = "locations")
    private String locations;

    @Column(name = "hometown")
    private String hometown;

    @Column(name = "last_update")
    private String lastUpdate;

    @Column(name = "pipl_creation_time")
    private String piplCreationTime;

    @Column(name = "salary")
    private Long salary;

    @Column(name = "autos")
    private String autos;

    @Column(name = "education")
    private String education;

    @OneToMany(mappedBy = "piplPersonSocialUrls")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    @JsonIgnoreProperties(value = { "piplPersonSocialUrls" }, allowSetters = true)
    private Set<PiplSocialUrl> socialUrls = new HashSet<>();

    @OneToMany(mappedBy = "piplPersonJobs")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    @JsonIgnoreProperties(value = { "piplPersonJobs" }, allowSetters = true)
    private Set<PiplJob> jobs = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public PiplPerson id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public PiplPerson firstName(String firstName) {
        this.setFirstName(firstName);
        return this;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public PiplPerson middleName(String middleName) {
        this.setMiddleName(middleName);
        return this;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public PiplPerson lastName(String lastName) {
        this.setLastName(lastName);
        return this;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAkaNamesList() {
        return this.akaNamesList;
    }

    public PiplPerson akaNamesList(String akaNamesList) {
        this.setAkaNamesList(akaNamesList);
        return this;
    }

    public void setAkaNamesList(String akaNamesList) {
        this.akaNamesList = akaNamesList;
    }

    public String getPiplUid() {
        return this.piplUid;
    }

    public PiplPerson piplUid(String piplUid) {
        this.setPiplUid(piplUid);
        return this;
    }

    public void setPiplUid(String piplUid) {
        this.piplUid = piplUid;
    }

    public String getPipleOid() {
        return this.pipleOid;
    }

    public PiplPerson pipleOid(String pipleOid) {
        this.setPipleOid(pipleOid);
        return this;
    }

    public void setPipleOid(String pipleOid) {
        this.pipleOid = pipleOid;
    }

    public String getEmailList() {
        return this.emailList;
    }

    public PiplPerson emailList(String emailList) {
        this.setEmailList(emailList);
        return this;
    }

    public void setEmailList(String emailList) {
        this.emailList = emailList;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public PiplPerson phoneNumber(String phoneNumber) {
        this.setPhoneNumber(phoneNumber);
        return this;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return this.gender;
    }

    public PiplPerson gender(String gender) {
        this.setGender(gender);
        return this;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRace() {
        return this.race;
    }

    public PiplPerson race(String race) {
        this.setRace(race);
        return this;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getPoliticalParty() {
        return this.politicalParty;
    }

    public PiplPerson politicalParty(String politicalParty) {
        this.setPoliticalParty(politicalParty);
        return this;
    }

    public void setPoliticalParty(String politicalParty) {
        this.politicalParty = politicalParty;
    }

    public Instant getBirthday() {
        return this.birthday;
    }

    public PiplPerson birthday(Instant birthday) {
        this.setBirthday(birthday);
        return this;
    }

    public void setBirthday(Instant birthday) {
        this.birthday = birthday;
    }

    public String getLocations() {
        return this.locations;
    }

    public PiplPerson locations(String locations) {
        this.setLocations(locations);
        return this;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    public String getHometown() {
        return this.hometown;
    }

    public PiplPerson hometown(String hometown) {
        this.setHometown(hometown);
        return this;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getLastUpdate() {
        return this.lastUpdate;
    }

    public PiplPerson lastUpdate(String lastUpdate) {
        this.setLastUpdate(lastUpdate);
        return this;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getPiplCreationTime() {
        return this.piplCreationTime;
    }

    public PiplPerson piplCreationTime(String piplCreationTime) {
        this.setPiplCreationTime(piplCreationTime);
        return this;
    }

    public void setPiplCreationTime(String piplCreationTime) {
        this.piplCreationTime = piplCreationTime;
    }

    public Long getSalary() {
        return this.salary;
    }

    public PiplPerson salary(Long salary) {
        this.setSalary(salary);
        return this;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getAutos() {
        return this.autos;
    }

    public PiplPerson autos(String autos) {
        this.setAutos(autos);
        return this;
    }

    public void setAutos(String autos) {
        this.autos = autos;
    }

    public String getEducation() {
        return this.education;
    }

    public PiplPerson education(String education) {
        this.setEducation(education);
        return this;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public Set<PiplSocialUrl> getSocialUrls() {
        return this.socialUrls;
    }

    public void setSocialUrls(Set<PiplSocialUrl> piplSocialUrls) {
        if (this.socialUrls != null) {
            this.socialUrls.forEach(i -> i.setPiplPersonSocialUrls(null));
        }
        if (piplSocialUrls != null) {
            piplSocialUrls.forEach(i -> i.setPiplPersonSocialUrls(this));
        }
        this.socialUrls = piplSocialUrls;
    }

    public PiplPerson socialUrls(Set<PiplSocialUrl> piplSocialUrls) {
        this.setSocialUrls(piplSocialUrls);
        return this;
    }

    public PiplPerson addSocialUrls(PiplSocialUrl piplSocialUrl) {
        this.socialUrls.add(piplSocialUrl);
        piplSocialUrl.setPiplPersonSocialUrls(this);
        return this;
    }

    public PiplPerson removeSocialUrls(PiplSocialUrl piplSocialUrl) {
        this.socialUrls.remove(piplSocialUrl);
        piplSocialUrl.setPiplPersonSocialUrls(null);
        return this;
    }

    public Set<PiplJob> getJobs() {
        return this.jobs;
    }

    public void setJobs(Set<PiplJob> piplJobs) {
        if (this.jobs != null) {
            this.jobs.forEach(i -> i.setPiplPersonJobs(null));
        }
        if (piplJobs != null) {
            piplJobs.forEach(i -> i.setPiplPersonJobs(this));
        }
        this.jobs = piplJobs;
    }

    public PiplPerson jobs(Set<PiplJob> piplJobs) {
        this.setJobs(piplJobs);
        return this;
    }

    public PiplPerson addJobs(PiplJob piplJob) {
        this.jobs.add(piplJob);
        piplJob.setPiplPersonJobs(this);
        return this;
    }

    public PiplPerson removeJobs(PiplJob piplJob) {
        this.jobs.remove(piplJob);
        piplJob.setPiplPersonJobs(null);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PiplPerson)) {
            return false;
        }
        return id != null && id.equals(((PiplPerson) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "PiplPerson{" +
            "id=" + getId() +
            ", firstName='" + getFirstName() + "'" +
            ", middleName='" + getMiddleName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", akaNamesList='" + getAkaNamesList() + "'" +
            ", piplUid='" + getPiplUid() + "'" +
            ", pipleOid='" + getPipleOid() + "'" +
            ", emailList='" + getEmailList() + "'" +
            ", phoneNumber='" + getPhoneNumber() + "'" +
            ", gender='" + getGender() + "'" +
            ", race='" + getRace() + "'" +
            ", politicalParty='" + getPoliticalParty() + "'" +
            ", birthday='" + getBirthday() + "'" +
            ", locations='" + getLocations() + "'" +
            ", hometown='" + getHometown() + "'" +
            ", lastUpdate='" + getLastUpdate() + "'" +
            ", piplCreationTime='" + getPiplCreationTime() + "'" +
            ", salary=" + getSalary() +
            ", autos='" + getAutos() + "'" +
            ", education='" + getEducation() + "'" +
            "}";
    }
}
