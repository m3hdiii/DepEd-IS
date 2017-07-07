package com.thesis.model;

import java.util.List;

/**
 * Created by mehdi on 7/6/17.
 */
public class Category {

    private Long categoryId;
    private String name;
    private String description;
    private List<Category> subCategories;

    public Category(String name, String description, List<Category> subCategories) {
        this.name = name;
        this.description = description;
        this.subCategories = subCategories;
    }

    public Category(Long categoryId, String name, String description, List<Category> subCategories) {
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
        this.subCategories = subCategories;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
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

    public List<Category> getSubCategories() {
        return subCategories;
    }

    public void setSubCategories(List<Category> subCategories) {
        this.subCategories = subCategories;
    }
}
