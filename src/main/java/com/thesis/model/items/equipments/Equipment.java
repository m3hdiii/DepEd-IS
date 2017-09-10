package com.thesis.model.items.equipments;

import com.thesis.model.supplys.Supply;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "EQUIPMENT")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long equipmentId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "EQUIPMENT_STATUS")
    private EquipmentStatus equipmentStatus;

    @Column(name = "MODEL_NUMBER")
    private String modelNumber;

    @Column(name = "PURCHASE_PRICE")
    private Double purchasePrice;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "CREATION_DTAE")
    private Date creationDate;

    @ManyToOne
    @JoinColumn(name = "EQUIPMENT_INFO")
    private EquipmentInfo equipmentInfo;

    @ManyToMany
    @JoinTable(name = "SUPPLY_EQUIPMENT", joinColumns = @JoinColumn(name = "EQUIPMENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "SUPPLY_ID"))
    private Set<Supply> supplies = new HashSet<>();

    public Equipment() {
    }


}
