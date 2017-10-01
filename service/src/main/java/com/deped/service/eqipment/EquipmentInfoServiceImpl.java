package com.deped.service.eqipment;

import com.deped.model.items.equipment.EquipmentInfo;
import com.deped.repository.equipment.EquipmentInfoRepository;
import com.deped.repository.utils.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentInfoServiceImpl implements EquipmentInfoService {

    @Autowired
    private EquipmentInfoRepository equipmentInfoRepository;

    @Override
    public EquipmentInfo create(EquipmentInfo entity) {
        return null;
    }

    @Override
    public Boolean update(EquipmentInfo entity) {
        return null;
    }

    @Override
    public List<EquipmentInfo> fetchAll() {
        return null;
    }

    @Override
    public List<EquipmentInfo> fetchByRange(Range range) {
        return null;
    }

    @Override
    public EquipmentInfo fetchById(Object id) {
        return null;
    }

    @Override
    public Boolean remove(EquipmentInfo... entities) {
        return null;
    }
}
