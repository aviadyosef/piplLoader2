package com.jg.osint.jg.pipl.loader.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import java.io.Serializable;

/**
 * A PiplSocialUrl.
 */
@Entity
@Table(name = "pipl_social_url")
public class PiplSocialUrl implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "data_source")
    private String dataSource;

    @Column(name = "domain")
    private String domain;

    @Column(name = "name")
    private String name;

    @Column(name = "url")
    private String url;

    @ManyToOne
    @JsonIgnoreProperties(value = { "socialUrls", "jobs" }, allowSetters = true)
    private PiplPerson piplPersonSocialUrls;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public PiplSocialUrl id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDataSource() {
        return this.dataSource;
    }

    public PiplSocialUrl dataSource(String dataSource) {
        this.setDataSource(dataSource);
        return this;
    }

    public void setDataSource(String dataSource) {
        this.dataSource = dataSource;
    }

    public String getDomain() {
        return this.domain;
    }

    public PiplSocialUrl domain(String domain) {
        this.setDomain(domain);
        return this;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getName() {
        return this.name;
    }

    public PiplSocialUrl name(String name) {
        this.setName(name);
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return this.url;
    }

    public PiplSocialUrl url(String url) {
        this.setUrl(url);
        return this;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public PiplPerson getPiplPersonSocialUrls() {
        return this.piplPersonSocialUrls;
    }

    public void setPiplPersonSocialUrls(PiplPerson piplPerson) {
        this.piplPersonSocialUrls = piplPerson;
    }

    public PiplSocialUrl piplPersonSocialUrls(PiplPerson piplPerson) {
        this.setPiplPersonSocialUrls(piplPerson);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PiplSocialUrl)) {
            return false;
        }
        return id != null && id.equals(((PiplSocialUrl) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "PiplSocialUrl{" +
            "id=" + getId() +
            ", dataSource='" + getDataSource() + "'" +
            ", domain='" + getDomain() + "'" +
            ", name='" + getName() + "'" +
            ", url='" + getUrl() + "'" +
            "}";
    }
}
