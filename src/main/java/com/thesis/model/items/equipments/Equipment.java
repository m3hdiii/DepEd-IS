package com.thesis.model.items.equipments;

import com.thesis.model.supplys.Supply;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "equipment")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "equipment_id")
    private Long equipmentId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "equipment_status")
    @Enumerated(value = EnumType.STRING)
    private EquipmentStatus equipmentStatus;

    @Column(name = "model_number")
    private String modelNumber;

    @Column(name = "purchase_price")
    private Double purchasePrice;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_date")
    private Date creationDate;

    @ManyToOne
    @JoinColumn(name = "equipment_info")
    private EquipmentInfo equipmentInfo;

    @ManyToMany
    @JoinTable(name = "supply_equipment", joinColumns = @JoinColumn(name = "equipment_id"),
            inverseJoinColumns = @JoinColumn(name = "supply_id"))
    private Set<Supply> supplies = new HashSet<>();

    public Equipment() {
    }

}
