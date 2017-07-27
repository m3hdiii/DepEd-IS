package com.thesis.model;

import javax.persistence.*;

/**
 * Created by Mehdi on 6/8/2017.
 */

@Entity
@Table(name = "SECTION")
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SELECTION_ID")
    private Long sectionId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @ManyToOne
    @JoinColumn(name = "DEPARTMENT_ID")
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

    @Override
    public String toString() {
        return name;
    }
}