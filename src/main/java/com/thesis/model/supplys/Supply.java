package com.thesis.model.supplys;

import com.thesis.model.items.semigoods.Item;
import com.thesis.model.items.equipments.Equipment;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mehdi on 7/6/17.
 */

@Entity
@Table(name = "supplyofficer")
public class Supply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supply_id")
    private Long supplyId;

    @Column(name = "description")
    private String description;

    @Embedded
    private DeliveryInformation deliveryInformation;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "supplies")
    private Set<Equipment> equipments = new HashSet<>();

    @OneToMany
    private Set<Item> items = new HashSet<>();



}
