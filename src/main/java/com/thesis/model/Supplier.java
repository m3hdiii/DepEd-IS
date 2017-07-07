package com.thesis.model;

/**
 * Created by mehdi on 7/6/17.
 */
public class Supplier {
//    supplier (supplier_id, name, description, contact_no1, contact_no2, address,
//              remarks)

    private Long supplierId;
    private String name;
    private String description;
    private String supplierContactNumber;
    private String supplierContactNumber2;
    private String supplierAddress;
    private String text;

    public Supplier(String name, String description, String supplierContactNumber, String supplierContactNumber2, String supplierAddress, String text) {
        this.name = name;
        this.description = description;
        this.supplierContactNumber = supplierContactNumber;
        this.supplierContactNumber2 = supplierContactNumber2;
        this.supplierAddress = supplierAddress;
        this.text = text;
    }

    public Supplier(Long supplierId, String name, String description, String supplierContactNumber, String supplierContactNumber2, String supplierAddress, String text) {
        this.supplierId = supplierId;
        this.name = name;
        this.description = description;
        this.supplierContactNumber = supplierContactNumber;
        this.supplierContactNumber2 = supplierContactNumber2;
        this.supplierAddress = supplierAddress;
        this.text = text;
    }

    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
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

    public String getSupplierContactNumber() {
        return supplierContactNumber;
    }

    public void setSupplierContactNumber(String supplierContactNumber) {
        this.supplierContactNumber = supplierContactNumber;
    }

    public String getSupplierContactNumber2() {
        return supplierContactNumber2;
    }

    public void setSupplierContactNumber2(String supplierContactNumber2) {
        this.supplierContactNumber2 = supplierContactNumber2;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
