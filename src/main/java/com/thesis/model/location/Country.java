package com.thesis.model.location;

import com.thesis.model.account.User;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by mehdi on 7/10/17.
 */

@Entity
@Table(name = "country")
public class Country {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "country_id")
    private Long countryId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "continent_id")
    private Continent continent;

    @OneToMany(mappedBy = "country")
    private Set<City> cities;

    @OneToOne(mappedBy = "county")
    private User user;


}
