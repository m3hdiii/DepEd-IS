package com.deped.model.supply;

import com.deped.model.items.equipment.Equipment;
import com.deped.model.items.semigoods.Item;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static com.deped.repository.utils.ConstantValues.FETCH_ALL_SUPPLY;

/**
 * Created by mehdi on 7/6/17.
 */

@NamedQueries({
        @NamedQuery(name = FETCH_ALL_SUPPLY, query = "SELECT supply FROM Supply supply")
})
@Entity
@Table(name = "supply")
public class Supply implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supply_id")
    private Long supplyId;

    @Column(name = "description")
    private String description;

//    @Embedded
//    private DeliveryInformation deliveryInformation;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "supplies")
    @JsonManagedReference
    private Set<Equipment> equipments = new HashSet<>();

//    @OneToMany
//    private Set<Item> items = new HashSet<>();

    @Column(name = "creation_date")
    private Date creationDate;

    public Long getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(Long supplyId) {
        this.supplyId = supplyId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

//    public DeliveryInformation getDeliveryInformation() {
//        return deliveryInformation;
//    }
//
//    public void setDeliveryInformation(DeliveryInformation deliveryInformation) {
//        this.deliveryInformation = deliveryInformation;
//    }

    public Set<Equipment> getEquipments() {
        return equipments;
    }

    public void setEquipments(Set<Equipment> equipments) {
        this.equipments = equipments;
    }

//    public Set<Item> getItems() {
//        return items;
//    }
//
//    public void setItems(Set<Item> items) {
//        this.items = items;
//    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
