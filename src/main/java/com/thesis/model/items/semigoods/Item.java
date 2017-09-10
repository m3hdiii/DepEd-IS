package com.thesis.model.items.semigoods;


import com.thesis.model.items.Visibility;
import com.thesis.model.items.Brand;
import com.thesis.model.requests.Request;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mehdi on 7/6/17.
 */

@Entity
@Table(name = "ITEM")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ITEM_ID")
    private Long itemId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "ITEM_TYPE")
    private ItemType itemType;

    @Column(name = "VISIBILITY")
    private Visibility visibility;

    @Column(name = "THRESHHOLD")
    private Integer threshhold;

    @Column(name = "QUANTITY")
    private Integer quantity;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "items")
    private Set<Request> requests = new HashSet<>();

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @ManyToOne
    @JoinColumn(name = "BRAND_ID")
    private Brand brand;

    public Item() {
    }

    public Item(String name, String description, ItemType itemType, Visibility visibility, Integer threshhold, Integer quantity, Set<Request> requests, Date creationDate, Brand brand) {
        this.name = name;
        this.description = description;
        this.itemType = itemType;
        this.visibility = visibility;
        this.threshhold = threshhold;
        this.quantity = quantity;
        this.requests = requests;
        this.creationDate = creationDate;
        this.brand = brand;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
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

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    public Integer getThreshhold() {
        return threshhold;
    }

    public void setThreshhold(Integer threshhold) {
        this.threshhold = threshhold;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Set<Request> getRequests() {
        return requests;
    }

    public void setRequests(Set<Request> requests) {
        this.requests = requests;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
