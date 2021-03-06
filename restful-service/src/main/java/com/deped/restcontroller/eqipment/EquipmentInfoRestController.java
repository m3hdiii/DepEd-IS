package com.deped.restcontroller.eqipment;

import com.deped.model.Response;
import com.deped.model.items.equipment.EquipmentInfo;
import com.deped.repository.utils.Range;
import com.deped.restcontroller.AbstractMainRestController;
import com.deped.service.equipment.EquipmentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EquipmentInfoRestController extends AbstractMainRestController<EquipmentInfo, Long> {

    private static final String BASE_NAME = "equipment-brand";
    private static final String CREATE_MAPPING = BASE_NAME + CREATE_PATTERN;
    private static final String UPDATE_MAPPING = BASE_NAME + UPDATE_PATTERN;
    private static final String FETCH_MAPPING = BASE_NAME + FETCH_PATTERN;
    private static final String FETCH_BY_RANGE_MAPPING = BASE_NAME + FETCH_PATTERN + RANGE_PATTERN;
    private static final String FETCH_BY_ID_MAPPING = BASE_NAME + FETCH_BY_ID_PATTERN;
    private static final String REMOVE_MAPPING = BASE_NAME + REMOVE_PATTERN;

    @Autowired
    private EquipmentInfoService equipmentInfoService;

    @Override
    @RequestMapping(value = CREATE_MAPPING, method = RequestMethod.POST)
    public ResponseEntity<EquipmentInfo> create(@RequestBody EquipmentInfo entity) {
        ResponseEntity<EquipmentInfo> response = equipmentInfoService.create(entity);
        return response;
    }

    @Override
    @RequestMapping(value = UPDATE_MAPPING, method = RequestMethod.POST)
    public ResponseEntity<Response> update(@RequestBody EquipmentInfo entity) {
        ResponseEntity<Response> response = equipmentInfoService.update(entity);
        return response;
    }

    @Override
    @RequestMapping(value = FETCH_MAPPING, method = RequestMethod.POST)
    public ResponseEntity<List<EquipmentInfo>> fetchAll() {
        ResponseEntity<List<EquipmentInfo>> response = equipmentInfoService.fetchAll();
        return response;
    }

    @Override
    @RequestMapping(value = FETCH_BY_RANGE_MAPPING, method = RequestMethod.POST)
    public ResponseEntity<List<EquipmentInfo>> fetchByRange(@PathVariable(FROM_STRING_LITERAL) int from, @PathVariable(TO_STRING_LITERAL) int to) {
        ResponseEntity<List<EquipmentInfo>> response = equipmentInfoService.fetchByRange(new Range(from, to));
        return response;
    }

    @Override
    @RequestMapping(value = FETCH_BY_ID_MAPPING, method = RequestMethod.GET)
    public ResponseEntity<EquipmentInfo> fetchById(@PathVariable(ID_STRING_LITERAL) Long aLong) {
        ResponseEntity<EquipmentInfo> equipmentInfo = equipmentInfoService.fetchById(aLong);
        return equipmentInfo;
    }

    @Override
    @RequestMapping(value = REMOVE_MAPPING, method = RequestMethod.POST)
    public ResponseEntity<Response> remove(@RequestBody EquipmentInfo... entities) {
        ResponseEntity<Response> response = equipmentInfoService.remove(entities);
        return response;
    }
}
