package com.thesis.service;

import com.thesis.model.Equipment;
import com.thesis.model.Item;
import com.thesis.repository.EquipmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mehdi on 7/18/17.
 */
@Service
public class EquipmentServiceImpl implements EquipmentService{

    @Autowired
    private EquipmentRepository equipmentRepository;
    @Override
    public List<Equipment> fetchItems() {
        List<Equipment> equipmentList = equipmentRepository.fetchEquipment();
        return equipmentList;
    }

    @Override
    public boolean addItem(Equipment item) {
        return false;
    }

    @Override
    public boolean editItem(Equipment item) {
        return false;
    }

    @Override
    public boolean deleteItem(Equipment item) {
        return false;
    }
}
