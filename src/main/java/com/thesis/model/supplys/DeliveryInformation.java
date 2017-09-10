package com.thesis.model.supplys;

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


    public DeliveryInformation() {
    }

    public DeliveryInformation(Date deliveryDate, String deliveryPersonName, String deliveryPersonContactNumber, String deliveryPersonContactNumber2) {
        this.deliveryDate = deliveryDate;
        this.deliveryPersonName = deliveryPersonName;
        this.deliveryPersonContactNumber = deliveryPersonContactNumber;
        this.deliveryPersonContactNumber2 = deliveryPersonContactNumber2;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryPersonName() {
        return deliveryPersonName;
    }

    public void setDeliveryPersonName(String deliveryPersonName) {
        this.deliveryPersonName = deliveryPersonName;
    }

    public String getDeliveryPersonContactNumber() {
        return deliveryPersonContactNumber;
    }

    public void setDeliveryPersonContactNumber(String deliveryPersonContactNumber) {
        this.deliveryPersonContactNumber = deliveryPersonContactNumber;
    }

    public String getDeliveryPersonContactNumber2() {
        return deliveryPersonContactNumber2;
    }

    public void setDeliveryPersonContactNumber2(String deliveryPersonContactNumber2) {
        this.deliveryPersonContactNumber2 = deliveryPersonContactNumber2;
    }
}
