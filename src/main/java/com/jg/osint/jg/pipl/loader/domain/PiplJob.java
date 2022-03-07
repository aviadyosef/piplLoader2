package com.jg.osint.jg.pipl.loader.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;

/**
 * A PiplJob.
 */
@Entity
@Table(name = "pipl_job")
public class PiplJob implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "company")
    private String company;

    @Column(name = "title")
    private String title;

    @Column(name = "start_year")
    private String startYear;

    @Column(name = "end_year")
    private String endYear;

    @Column(name = "salary")
    private Long salary;

    @ManyToOne
    @JsonIgnoreProperties(value = { "socialUrls", "jobs" }, allowSetters = true)
    private PiplPerson piplPersonJobs;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public PiplJob id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompany() {
        return this.company;
    }

    public PiplJob company(String company) {
        this.setCompany(company);
        return this;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return this.title;
    }

    public PiplJob title(String title) {
        this.setTitle(title);
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStartYear() {
        return this.startYear;
    }

    public PiplJob startYear(String startYear) {
        this.setStartYear(startYear);
        return this;
    }

    public void setStartYear(String startYear) {
        this.startYear = startYear;
    }

    public String getEndYear() {
        return this.endYear;
    }

    public PiplJob endYear(String endYear) {
        this.setEndYear(endYear);
        return this;
    }

    public void setEndYear(String endYear) {
        this.endYear = endYear;
    }

    public Long getSalary() {
        return this.salary;
    }

    public PiplJob salary(Long salary) {
        this.setSalary(salary);
        return this;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public PiplPerson getPiplPersonJobs() {
        return this.piplPersonJobs;
    }

    public void setPiplPersonJobs(PiplPerson piplPerson) {
        this.piplPersonJobs = piplPerson;
    }

    public PiplJob piplPersonJobs(PiplPerson piplPerson) {
        this.setPiplPersonJobs(piplPerson);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PiplJob)) {
            return false;
        }
        return id != null && id.equals(((PiplJob) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "PiplJob{" +
            "id=" + getId() +
            ", company='" + getCompany() + "'" +
            ", title='" + getTitle() + "'" +
            ", startYear='" + getStartYear() + "'" +
            ", endYear='" + getEndYear() + "'" +
            ", salary=" + getSalary() +
            "}";
    }
}
