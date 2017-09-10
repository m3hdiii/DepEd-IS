package com.thesis.service;

import com.thesis.model.items.equipments.Equipment;

import java.util.List;

/**
 * Created by mehdi on 7/18/17.
 */

public interface EquipmentService {
    List<Equipment> fetchItems();
    boolean addItem(Equipment item);
    boolean editItem(Equipment item);
    boolean deleteItem(Equipment item);
}
