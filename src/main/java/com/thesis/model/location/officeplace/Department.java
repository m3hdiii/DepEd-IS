package com.thesis.model.location.officeplace;

import com.thesis.model.account.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mehdi on 6/8/2017.
 */

@Entity
@Table(name = "DEPARTMENT")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DEPARTMENT_ID")
    private Long departmentId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
    private List<Section> sections = new ArrayList<>();

    @Column(name = "DEPARTMENT_HEAD")
    private User departmentHead;

    public Department() {
    }

    public Department(String name, String description, List<Section> sections, User departmentHead) {
        this.name = name;
        this.description = description;
        this.sections = sections;
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

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    public User getDepartmentHead() {
        return departmentHead;
    }

    public void setDepartmentHead(User departmentHead) {
        this.departmentHead = departmentHead;
    }
}
