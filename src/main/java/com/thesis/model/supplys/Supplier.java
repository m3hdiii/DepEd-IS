package com.thesis.model.supplys;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by mehdi on 7/6/17.
 */

@Entity
@Table(name = "SUPPLIER")
public class Supplier {
//    supplier (supplier_id, name, description, contact_no1, contact_no2, address,
//              remarks)

    @Column(name = "SUPPLER_ID")
    private Long supplierId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "SUPPLIER_CONTACT_NUMBER1")
    private String supplierContactNumber;

    @Column(name = "SUPPLIER_CONTACT_NUMBER2")
    private String supplierContactNumber2;

    @Column(name = "SUPPLIER_ADDRESS")
    private String supplierAddress;

    @Column(name = "TEXT")
    private String text;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATION_DATE")
    private Date creationDate;
}
