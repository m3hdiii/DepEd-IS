package com.deped.service.equipment;

import com.deped.model.Operation;
import com.deped.model.Response;
import com.deped.model.items.equipment.EquipmentInfo;
import com.deped.repository.equipment.EquipmentInfoRepository;
import com.deped.repository.utils.Range;
import com.deped.service.ServiceUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentInfoServiceImpl implements EquipmentInfoService {

    @Autowired
    private EquipmentInfoRepository equipmentInfoRepository;

    @Override
    public ResponseEntity<EquipmentInfo> create(EquipmentInfo entity) {
        EquipmentInfo savedEntity = equipmentInfoRepository.create(entity);
        ResponseEntity<EquipmentInfo> responseEntity = new ResponseEntity<>(savedEntity, OK);
        return responseEntity;
    }

    @Override
    public ResponseEntity<Response> update(EquipmentInfo entity) {
        Boolean isUpdated = equipmentInfoRepository.update(entity);
        Response response = ServiceUtils.makeResponse(isUpdated, Operation.UPDATE, EquipmentInfo.class);
        ResponseEntity<Response> responseEntity = new ResponseEntity<>(response, OK);
        return responseEntity;
    }

    @Override
    public ResponseEntity<List<EquipmentInfo>> fetchAll() {
        List<EquipmentInfo> equipmentInfo = equipmentInfoRepository.fetchAll();
        ResponseEntity<List<EquipmentInfo>> responseEntity = new ResponseEntity<>(equipmentInfo, OK);
        return responseEntity;
    }

    @Override
    public ResponseEntity<List<EquipmentInfo>> fetchByRange(Range range) {
        List<EquipmentInfo> equipmentInfo = equipmentInfoRepository.fetchByRange(range);
        ResponseEntity<List<EquipmentInfo>> responseEntity = new ResponseEntity<>(equipmentInfo, OK);
        return responseEntity;
    }

    @Override
    public ResponseEntity<EquipmentInfo> fetchById(Object id) {
        EquipmentInfo equipmentInfo = equipmentInfoRepository.fetchById(id);
        ResponseEntity<EquipmentInfo> responseEntity = new ResponseEntity<>(equipmentInfo, OK);
        return responseEntity;
    }

    @Override
    public ResponseEntity<Response> remove(EquipmentInfo... entities) {
        Boolean isRemoved = equipmentInfoRepository.remove(entities);
        Response response = ServiceUtils.makeResponse(isRemoved, Operation.DELETE, EquipmentInfo.class);
        ResponseEntity<Response> responseEntity = new ResponseEntity<>(response, OK);
        return responseEntity;
    }
}
