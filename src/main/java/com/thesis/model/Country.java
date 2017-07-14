package com.thesis.model;

/**
 * Created by mehdi on 7/10/17.
 */
public class Country {

    private Long countryId;
    private String name;
    private String description;

    public Country(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Country(Long countryId, String name, String description) {
        this.countryId = countryId;
        this.name = name;
        this.description = description;
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
}
