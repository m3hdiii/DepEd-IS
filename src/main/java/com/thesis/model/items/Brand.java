package com.thesis.model.items;

import com.thesis.model.items.semigoods.Item;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehdi on 7/6/17.
 */

@Entity
@Table(name = "brand")
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "brand_id")
    private Long brandId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "contact_number1")
    private String contactNumber;

    @Column(name = "contact_number2")
    private String contactNumber2;

    @Column(name = "central_office_address")
    private String centralOfficeAddress;

    @Column(name = "central_service_address")
    private String serviceCenterAddress;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "brand")
    private List<Item> items = new ArrayList<>();

}
