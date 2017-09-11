package com.thesis.model.supplys;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by mehdi on 7/6/17.
 */

@Entity
@Table(name = "supplier")
public class Supplier {
//    supplier (supplier_id, name, description, contact_no1, contact_no2, address,
//              remarks)

    @Column(name = "supplier_id")
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
}
