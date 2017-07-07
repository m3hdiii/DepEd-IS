package com.thesis.model;

import java.util.Date;

/**
 * Created by mehdi on 7/6/17.
 */
public class DeliveryInformation {

    private Long deliveryId;
    private Date deliveryDate;
    private String deliveryPersonName;
    private String deliveryPersonContactNumber;
    private String deliveryPersonContactNumber2;


    public DeliveryInformation(Date deliveryDate, String deliveryPersonName, String deliveryPersonContactNumber, String deliveryPersonContactNumber2) {
        this.deliveryDate = deliveryDate;
        this.deliveryPersonName = deliveryPersonName;
        this.deliveryPersonContactNumber = deliveryPersonContactNumber;
        this.deliveryPersonContactNumber2 = deliveryPersonContactNumber2;
    }

    public DeliveryInformation(Long deliveryId, Date deliveryDate, String deliveryPersonName, String deliveryPersonContactNumber, String deliveryPersonContactNumber2) {
        this.deliveryId = deliveryId;
        this.deliveryDate = deliveryDate;
        this.deliveryPersonName = deliveryPersonName;
        this.deliveryPersonContactNumber = deliveryPersonContactNumber;
        this.deliveryPersonContactNumber2 = deliveryPersonContactNumber2;
    }

    public Long getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Long deliveryId) {
        this.deliveryId = deliveryId;
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
