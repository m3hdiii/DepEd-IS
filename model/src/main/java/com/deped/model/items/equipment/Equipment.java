package com.deped.model.items.equipment;

import com.deped.model.supply.Supply;

import static com.deped.repository.utils.ConstantValues.*;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@NamedQueries({
        @NamedQuery(
                name = FETCH_ALL_EQUIPMENTS,
                query = "SELECT eq FROM Equipment eq"
        )
})
@Entity
@Table(name = "equipment")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "equipment_id")
    private Long equipmentId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "equipment_status")
    @Enumerated(value = EnumType.STRING)
    private EquipmentStatus equipmentStatus;

    @Column(name = "model_number")
    private String modelNumber;

    @Column(name = "purchase_price")
    private Double purchasePrice;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_date")
    private Date creationDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "equipment_info_id")
    private EquipmentInfo equipmentInfo;

    @ManyToMany
    @JoinTable(name = "supply_equipment", joinColumns = @JoinColumn(name = "equipment_id"),
            inverseJoinColumns = @JoinColumn(name = "supply_id"))
    private Set<Supply> supplies = new HashSet<>();

    @Column(name = "color")
    @Enumerated(EnumType.STRING)
    private Color color;

    public Equipment() {
    }

    public Equipment(String name, String description, EquipmentStatus equipmentStatus, String modelNumber, Double purchasePrice, Date creationDate, EquipmentInfo equipmentInfo, Set<Supply> supplies) {
        this.name = name;
        this.description = description;
        this.equipmentStatus = equipmentStatus;
        this.modelNumber = modelNumber;
        this.purchasePrice = purchasePrice;
        this.creationDate = creationDate;
        this.equipmentInfo = equipmentInfo;
        this.supplies = supplies;
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

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public EquipmentInfo getEquipmentInfo() {
        return equipmentInfo;
    }

    public void setEquipmentInfo(EquipmentInfo equipmentInfo) {
        this.equipmentInfo = equipmentInfo;
    }

    public Set<Supply> getSupplies() {
        return supplies;
    }

    public void setSupplies(Set<Supply> supplies) {
        this.supplies = supplies;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


}
