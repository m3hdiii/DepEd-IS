package com.thesis.model.supply;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * Created by mehdi on 7/6/17.
 */

@Embeddable
public class DeliveryInformation {

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "delivery_date")
    private Date deliveryDate;

    @Column(name = "delivery_person_name")
    private String deliveryPersonName;

    @Column(name = "delivery_person_contact_nom1")
    private String deliveryPersonContactNumber;

    @Column(name = "delivery_person_contact_nom2")
    private String deliveryPersonContactNumber2;


}
