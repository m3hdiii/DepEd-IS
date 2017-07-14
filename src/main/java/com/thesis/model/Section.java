package com.thesis.model;

/**
 * Created by Mehdi on 6/8/2017.
 */
public class Section {

    private Long sectionId;
    private String name;
    private String description;
    private Department department;

    public Section(){}

    public Section(String name, String description, Department department) {
        this.name = name;
        this.description = description;
        this.department = department;
    }

    public Section(Long sectionId, String name, String description, Department department) {
        this.sectionId = sectionId;
        this.name = name;
        this.description = description;
        this.department = department;
    }

    public Long getSectionId() {
        return sectionId;
    }

    public void setSectionId(Long sectionId) {
        this.sectionId = sectionId;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}