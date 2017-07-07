package com.thesis.model;

/**
 * Created by mehdi on 7/6/17.
 */
public class EquipmentInfo {

    private Long equipmentInfoId;
    private String size;
    private Material material;
    private Integer weight;
    private Integer quantity;
    private EquipmentType equipmentType;
    //equipmentBrand
    private Short lifespan;

    public EquipmentInfo(String size, Material material, Integer weight, Integer quantity, EquipmentType equipmentType, Short lifespan) {
        this.size = size;
        this.material = material;
        this.weight = weight;
        this.quantity = quantity;
        this.equipmentType = equipmentType;
        this.lifespan = lifespan;
    }

    public EquipmentInfo(Long equipmentInfoId, String size, Material material, Integer weight, Integer quantity, EquipmentType equipmentType, Short lifespan) {
        this.equipmentInfoId = equipmentInfoId;
        this.size = size;
        this.material = material;
        this.weight = weight;
        this.quantity = quantity;
        this.equipmentType = equipmentType;
        this.lifespan = lifespan;
    }

    public Long getEquipmentInfoId() {
        return equipmentInfoId;
    }

    public void setEquipmentInfoId(Long equipmentInfoId) {
        this.equipmentInfoId = equipmentInfoId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public EquipmentType getEquipmentType() {
        return equipmentType;
    }

    public void setEquipmentType(EquipmentType equipmentType) {
        this.equipmentType = equipmentType;
    }

    public Short getLifespan() {
        return lifespan;
    }

    public void setLifespan(Short lifespan) {
        this.lifespan = lifespan;
    }
}
