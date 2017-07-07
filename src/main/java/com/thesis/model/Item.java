package com.thesis.model;


/**
 * Created by mehdi on 7/6/17.
 */
public class Item {

    private Long itemId;
    private String name;
    private String description;
    private ItemType itemType;
    private Visibility  visibility;
    private Integer threshhold;
    private Integer quantity;
    private Brand brand;

    public Item(String name, String description, ItemType itemType, Visibility visibility, Integer threshhold, Integer quantity, Brand brand) {
        this.name = name;
        this.description = description;
        this.itemType = itemType;
        this.visibility = visibility;
        this.threshhold = threshhold;
        this.quantity = quantity;
        this.brand = brand;
    }

    public Item(Long itemId, String name, String description, ItemType itemType, Visibility visibility, Integer threshhold, Integer quantity, Brand brand) {
        this.itemId = itemId;
        this.name = name;
        this.description = description;
        this.itemType = itemType;
        this.visibility = visibility;
        this.threshhold = threshhold;
        this.quantity = quantity;
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

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
