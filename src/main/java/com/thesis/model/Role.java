package com.thesis.model;

/**
 * Created by Mehdi on 6/8/2017.
 */
public class Role {

    private Long roleId;
    private String name;
    private String description;
    public Role(){}

    public Role(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Role(Long roleId, String name, String description) {
        this.roleId = roleId;
        this.name = name;
        this.description = description;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
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
}
