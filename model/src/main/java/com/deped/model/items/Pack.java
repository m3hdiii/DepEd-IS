package com.deped.model.items;

import com.deped.model.items.semigoods.Item;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import static com.deped.repository.utils.ConstantValues.*;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by mehdi on 7/6/17.
 */

@NamedQueries({
        @NamedQuery(
                name = FETCH_ALL_PACKS,
                query = "SELECT p FROM Pack p"
        )
})
@Entity
@Table(name = "pack")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "packId", scope = Pack.class)
public class Pack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pack_id")
    private Long packId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "creation_date")
    private Date creationDate;

    @Column(name = "capacity")
    private Integer capacity;

    @JoinColumn(name = "item_id")
    @ManyToOne
    private Item item;

    public Pack() {
    }

    public Pack(String name, String description, Date creationDate) {
        this.name = name;
        this.description = description;
        this.creationDate = creationDate;
    }

    public Long getPackId() {
        return packId;
    }

    public void setPackId(Long packId) {
        this.packId = packId;
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

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
