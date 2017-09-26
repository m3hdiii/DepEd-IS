package com.thesis.model.items;

import javax.persistence.*;
import java.util.List;

/**
 * Created by mehdi on 7/6/17.
 */

@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "parent_category_id")
    private Category parentCategory;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "parentCategory")
    private List<Category> subCategories;


}
