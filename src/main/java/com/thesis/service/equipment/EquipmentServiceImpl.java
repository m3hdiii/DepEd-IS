package com.thesis.service.equipment;

import com.thesis.model.items.equipment.Equipment;
import com.thesis.repository.equipment.EquipmentRepository;
import com.thesis.repository.utils.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentServiceImpl implements EquipmentService {

    @Autowired
    private EquipmentRepository equipmentRepository;

    @Override
    public Equipment create(Equipment entity) {
        return equipmentRepository.create(entity);
    }

    @Override
    public Boolean update(Equipment entity) {
        return equipmentRepository.update(entity);
    }

    @Override
    public List<Equipment> fetchAll() {
        return equipmentRepository.fetchAll();
    }

    @Override
    public List<Equipment> fetchByRange(Range range) {
        return equipmentRepository.fetchByRange(range);
    }

    @Override
    public Equipment fetchById(Object id) {
        return equipmentRepository.fetchById(id);
    }

    @Override
    public Boolean remove(Equipment... entities) {
        return equipmentRepository.remove(entities);
    }
}
