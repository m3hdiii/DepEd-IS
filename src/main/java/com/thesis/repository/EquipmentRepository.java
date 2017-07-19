package com.thesis.repository;

import com.thesis.model.Equipment;
import com.thesis.model.Item;

import java.util.List;

/**
 * Created by mehdi on 7/18/17.
 */
public interface EquipmentRepository {
    List<Equipment> fetchEquipment();
    boolean addEquipment(Equipment item);
    boolean editEquipment(Equipment item);
    boolean deleteEquipment(Equipment item);
}
