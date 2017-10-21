package com.deped.model.items.equipment;

import com.deped.model.items.Material;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "equipment_info")
public class EquipmentInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "equipment_info_id")
    private Long equipmentInfoId;

    @Column(name = "size")
    private String size;

    @Column(name = "material")
    @Enumerated(value = EnumType.STRING)
    private Material material;

    @Column(name = "weight")
    private Integer weight;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "equipment_type")
    @Enumerated(value = EnumType.STRING)
    private EquipmentType equipmentType;
    //equipmentBrand

    @Column(name = "life_span")
    private Short lifespan;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "equipmentInfo")
    private List<Equipment> equipments;

    private Date creationDate;

    public EquipmentInfo() {
    }

    public EquipmentInfo(String size, Material material, Integer weight, Integer quantity, EquipmentType equipmentType, Short lifespan) {
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

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public List<Equipment> getEquipments() {
        return equipments;
    }

    public void setEquipments(List<Equipment> equipments) {
        this.equipments = equipments;
    }
}
