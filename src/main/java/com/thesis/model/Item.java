package com.thesis.model;


import javax.persistence.*;
import java.io.FileInputStream;
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
    private Visibility  visibility;

    @Column(name = "THRESHHOLD")
    private Integer threshhold;

    @Column(name = "QUANTITY")
    private Integer quantity;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "items")
    private Set<Request> requests = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "BRAND_ID")
    private Brand brand;

    public Item() {
    }
}
