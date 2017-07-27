package com.thesis.model;

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
    @Column(name = "DELIVERY_DATE")
    private Date deliveryDate;

    @Column(name = "DELIVERY_PERSON_NAME")
    private String deliveryPersonName;

    @Column(name = "DELIVERY_PERSON_CONTACT_NOM1")
    private String deliveryPersonContactNumber;

    @Column(name = "DELIVERY_PERSON_CONTACT_NOM2")
    private String deliveryPersonContactNumber2;



}
