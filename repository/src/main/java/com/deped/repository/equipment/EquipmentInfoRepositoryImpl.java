package com.deped.repository.equipment;

import com.deped.model.items.equipment.EquipmentInfo;
import com.deped.repository.utils.HibernateFacade;
import com.deped.repository.utils.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.deped.repository.utils.ConstantValues.*;

import java.util.List;

@Repository
public class EquipmentInfoRepositoryImpl implements EquipmentInfoRepository {

    @Autowired
    private HibernateFacade hibernateFacade;

    @Override
    public EquipmentInfo create(EquipmentInfo entity) {
        return hibernateFacade.saveEntity(EquipmentInfo.class, entity);
    }

    @Override
    public Boolean update(EquipmentInfo entity) {
        return hibernateFacade.updateEntity(entity);
    }

    @Override
    public List<EquipmentInfo> fetchAll() {
        return hibernateFacade.fetchAllEntity(FETCH_ALL_EQUIPMENT_INFO, EquipmentInfo.class);
    }

    @Override
    public List<EquipmentInfo> fetchByRange(Range range) {
        return hibernateFacade.fetchAllEntity(FETCH_ALL_EQUIPMENT_INFO_RANGE, range, EquipmentInfo.class);
    }

    @Override
    public EquipmentInfo fetchById(Object id) {
        return hibernateFacade.fetchEntityById(EquipmentInfo.class, id);
    }

    @Override
    public Boolean remove(EquipmentInfo... entities) {
        return hibernateFacade.removeEntities(EQUIPMENT_INFO_TABLE, EQUIPMENT_INFO_TABLE_ID, entities);
    }
}
