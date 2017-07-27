package com.thesis.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mehdi on 7/6/17.
 */

@Entity
@Table(name = "SUPPLY")
public class Supply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SUPPLY_ID")
    private Long supplyId;

    @Column(name = "DESCRIPTION")
    private String description;

    @Embedded
    private DeliveryInformation deliveryInformation;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "supplies")
    private Set<Equipment> equipments = new HashSet<>();

    @OneToMany
    private Set<Item> items = new HashSet<>();



}
