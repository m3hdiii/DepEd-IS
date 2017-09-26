package com.thesis.model.items.semigoods;


import com.thesis.model.items.Brand;
import com.thesis.model.items.Material;
import com.thesis.model.items.Visibility;
import com.thesis.model.requests.Request;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by mehdi on 7/6/17.
 */

@Entity
@Table(name = "item")
public class Item {

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

    @Column(name = "visibility")
    private Visibility visibility;

    @Column(name = "threshold")
    private Integer threshold;

    @Column(name = "quantity")
    private Integer quantity;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "items")
    private Set<Request> requests = new HashSet<>();

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_date")
    private Date creationDate;

    @ManyToOne
    @JoinColumn(name = "brand")
    private Brand brand;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "material")
    private Material material;


}
