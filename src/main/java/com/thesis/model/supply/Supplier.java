package com.thesis.model.supply;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by mehdi on 7/6/17.
 */

@Entity
@Table(name = "supplier")
public class Supplier {

    @Column(name = "supplier_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long supplierId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "supplier_contact_nom1")
    private String supplierContactNom1;

    @Column(name = "supplier_contact_nom2")
    private String supplierContactNom2;

    @Column(name = "supplier_address")
    private String supplierAddress;

    @Column(name = "text")
    private String text;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_date")
    private Date creationDate;

    public Supplier(String name, String description, String supplierContactNom1, String supplierContactNom2, String supplierAddress, String text, Date creationDate) {
        this.name = name;
        this.description = description;
        this.supplierContactNom1 = supplierContactNom1;
        this.supplierContactNom2 = supplierContactNom2;
        this.supplierAddress = supplierAddress;
        this.text = text;
        this.creationDate = creationDate;
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

    public String getSupplierContactNom1() {
        return supplierContactNom1;
    }

    public void setSupplierContactNom1(String supplierContactNom1) {
        this.supplierContactNom1 = supplierContactNom1;
    }

    public String getSupplierContactNom2() {
        return supplierContactNom2;
    }

    public void setSupplierContactNom2(String supplierContactNom2) {
        this.supplierContactNom2 = supplierContactNom2;
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

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
