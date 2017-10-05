package com.deped.model.items.semigoods;


import com.deped.model.items.Brand;
import com.deped.model.items.Material;
import com.deped.model.items.Visibility;
import com.deped.model.request.Request;
import com.deped.model.security.Role;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import static com.deped.repository.utils.ConstantValues.*;

/**
 * Created by mehdi on 7/6/17.
 */

@NamedQueries({
        @NamedQuery(name = FETCH_ALL_ITEMS, query = "SELECT i FROM Item i")
})
@Entity
@Table(name = "item")
public class Item implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Long itemId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "item_type")
    @Enumerated(value = EnumType.STRING)
    private ItemType itemType;

    @Column(name = "threshold")
    private Integer threshold;

    @Column(name = "quantity")
    private Integer quantity;

//    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "items", fetch = FetchType.LAZY)
//    private Set<Request> requests
// = new HashSet<>();

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_date")
    private Date creationDate;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "material")
    private Material material;

    public Item() {
    }

//    public Item(String name, String description, ItemType itemType, Integer threshold, Integer quantity, Set<Request> requests, Date creationDate, Brand brand, Material material) {
//        this.name = name;
//        this.description = description;
//        this.itemType = itemType;
//        this.threshold = threshold;
//        this.quantity = quantity;
//        this.requests = requests;
//        this.creationDate = creationDate;
//        this.brand = brand;
//        this.material = material;
//    }

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

    public Integer getThreshold() {
        return threshold;
    }

    public void setThreshold(Integer threshold) {
        this.threshold = threshold;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

//    public Set<Request> getRequests() {
//        return requests;
//    }
//
//    public void setRequests(Set<Request> requests) {
//        this.requests = requests;
//    }

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

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }


}
