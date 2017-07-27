package com.thesis.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehdi on 7/6/17.
 */

@Entity
@Table(name = "BRAND")
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BRAND_ID")
    private Long brandId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "CONTACT_NUMBER1")
    private String contactNumber;

    @Column(name = "CONTACT_NUMBER2")
    private String contactNumber2;

    @Column(name = "CENTRAL_OFFICE_ADDRESS")
    private String centralOfficeAddress;

    @Column(name = "CENTRAL_SERVICE_ADDRESS")
    private String serviceCenterAddress;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "brand")
    private List<Item> items = new ArrayList<>();

    public Brand() {
    }


}
