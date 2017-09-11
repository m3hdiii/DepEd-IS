package com.thesis.model.items.equipments;

import com.thesis.model.items.Material;

import javax.persistence.*;

@Entity
@Table(name = "equipment_info")
public class EquipmentInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "equipment_info_id")
    private Long equipmentInfoId;

    @Column(name = "size")
    private String size;

    @Column(name = "material")
    @Enumerated(value = EnumType.STRING)
    private Material material;

    @Column(name = "weight")
    private Integer weight;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "equipment_type")
    @Enumerated(value = EnumType.STRING)
    private EquipmentType equipmentType;
    //equipmentBrand

    @Column(name = "life_span")
    private Short lifespan;
}
