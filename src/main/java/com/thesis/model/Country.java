package com.thesis.model;

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


}
