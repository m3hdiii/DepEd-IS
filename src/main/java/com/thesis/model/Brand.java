package com.thesis.model;

/**
 * Created by mehdi on 7/6/17.
 */
public class Brand {

    private Long brandId;
    private String name;
    private String description;
    private String contactNumber;
    private String contactNumber2;
    private String centralOfficeAddress;
    private String serviceCenterAddress;


    public Brand(String name, String description, String contactNumber, String contactNumber2, String centralOfficeAddress, String serviceCenterAddress) {
        this.name = name;
        this.description = description;
        this.contactNumber = contactNumber;
        this.contactNumber2 = contactNumber2;
        this.centralOfficeAddress = centralOfficeAddress;
        this.serviceCenterAddress = serviceCenterAddress;
    }

    public Brand(Long brandId, String name, String description, String contactNumber, String contactNumber2, String centralOfficeAddress, String serviceCenterAddress) {
        this.brandId = brandId;
        this.name = name;
        this.description = description;
        this.contactNumber = contactNumber;
        this.contactNumber2 = contactNumber2;
        this.centralOfficeAddress = centralOfficeAddress;
        this.serviceCenterAddress = serviceCenterAddress;
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
}
