package com.thesis.model.location;

import javax.persistence.*;

/**
 * Created by mehdi on 7/10/17.
 */

@Entity
@Table(name = "COUNTRY")
public class Country {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COUNTRY_ID")
    private Long countryId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @ManyToOne
    @JoinColumn(name = "CONTINENT_ID")
    private Continent continent;

    public Country() {
    }

    public Country(String name, String description, Continent continent) {
        this.name = name;
        this.description = description;
        this.continent = continent;
    }

    public Long getCountryId() {
        return countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }
}
