package com.thesis.model.location.office;

import com.thesis.model.account.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mehdi on 6/8/2017.
 */

@Entity
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "department_id")
    private Long departmentId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
    private List<Section> sections = new ArrayList<>();

    @Column(name = "department_head")
    private User departmentHead;


}
