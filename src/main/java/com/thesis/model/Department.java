package com.thesis.model;

/**
 * Created by Mehdi on 6/8/2017.
 */
public class Department {

    private Long departmentId;
    private String name;
    private String description;
    private String departmentHead;

    public Department(String name, String description, String departmentHead) {
        this.name = name;
        this.description = description;
        this.departmentHead = departmentHead;
    }

    public Department(Long departmentId, String name, String description, String departmentHead) {
        this.departmentId = departmentId;
        this.name = name;
        this.description = description;
        this.departmentHead = departmentHead;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
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

    public String getDepartmentHead() {
        return departmentHead;
    }

    public void setDepartmentHead(String departmentHead) {
        this.departmentHead = departmentHead;
    }
}
