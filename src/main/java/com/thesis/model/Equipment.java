package com.thesis.model;

import java.io.File;

/**
 * Created by mehdi on 7/6/17.
 */

//TODO
public class Equipment {

    private Long equipmentId;
    private String name;
    private String description;
    private EquipmentStatus equipmentStatus;
    private String modelNumber;
    private Double purchasePrice;
    private EquipmentInfo equipmentInfo;
    private Supply supply;

    public Equipment(String name, String description, EquipmentStatus equipmentStatus, String modelNumber, Double purchasePrice, EquipmentInfo equipmentInfo, Supply supply) {
        this.name = name;
        this.description = description;
        this.equipmentStatus = equipmentStatus;
        this.modelNumber = modelNumber;
        this.purchasePrice = purchasePrice;
        this.equipmentInfo = equipmentInfo;
        this.supply = supply;
    }

    public Equipment(Long equipmentId, String name, String description, EquipmentStatus equipmentStatus, String modelNumber, Double purchasePrice, EquipmentInfo equipmentInfo, Supply supply) {
        this.equipmentId = equipmentId;
        this.name = name;
        this.description = description;
        this.equipmentStatus = equipmentStatus;
        this.modelNumber = modelNumber;
        this.purchasePrice = purchasePrice;
        this.equipmentInfo = equipmentInfo;
        this.supply = supply;
    }

    public Long getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(Long equipmentId) {
        this.equipmentId = equipmentId;
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

    public EquipmentStatus getEquipmentStatus() {
        return equipmentStatus;
    }

    public void setEquipmentStatus(EquipmentStatus equipmentStatus) {
        this.equipmentStatus = equipmentStatus;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public EquipmentInfo getEquipmentInfo() {
        return equipmentInfo;
    }

    public void setEquipmentInfo(EquipmentInfo equipmentInfo) {
        this.equipmentInfo = equipmentInfo;
    }

    public Supply getSupply() {
        return supply;
    }

    public void setSupply(Supply supply) {
        this.supply = supply;
    }
}
