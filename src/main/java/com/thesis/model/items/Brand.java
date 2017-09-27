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

    public Brand() {
    }

    public Brand(String name, String description, String contactNumber, String contactNumber2, String centralOfficeAddress, String serviceCenterAddress, List<Item> items) {
        this.name = name;
        this.description = description;
        this.contactNumber = contactNumber;
        this.contactNumber2 = contactNumber2;
        this.centralOfficeAddress = centralOfficeAddress;
        this.serviceCenterAddress = serviceCenterAddress;
        this.items = items;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getContactNumber2() {
        return contactNumber2;
    }

    public void setContactNumber2(String contactNumber2) {
        this.contactNumber2 = contactNumber2;
    }

    public String getCentralOfficeAddress() {
        return centralOfficeAddress;
    }

    public void setCentralOfficeAddress(String centralOfficeAddress) {
        this.centralOfficeAddress = centralOfficeAddress;
    }

    public String getServiceCenterAddress() {
        return serviceCenterAddress;
    }

    public void setServiceCenterAddress(String serviceCenterAddress) {
        this.serviceCenterAddress = serviceCenterAddress;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
