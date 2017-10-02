package com.deped.restcontroller.eqipment;

import com.deped.restcontroller.AbstractMainRestController;
import com.deped.restcontroller.Operation;
import com.deped.model.Response;
import com.deped.model.items.equipment.Equipment;
import com.deped.repository.utils.Range;
import com.deped.service.equipment.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EquipmentRestController extends AbstractMainRestController<Equipment, Long> {

    private static final String BASE_NAME = "equipment";
    private static final String CREATE_MAPPING = BASE_NAME + CREATE_PATTERN;
    private static final String UPDATE_MAPPING = BASE_NAME + UPDATE_PATTERN;
    private static final String FETCH_MAPPING = BASE_NAME + FETCH_PATTERN;
    private static final String FETCH_BY_RANGE_MAPPING = BASE_NAME + FETCH_PATTERN + RANGE_PATTERN;
    private static final String FETCH_BY_ID_MAPPING = BASE_NAME + FETCH_BY_ID_PATTERN;
    private static final String REMOVE_MAPPING = BASE_NAME + REMOVE_PATTERN;

    @Autowired
    private EquipmentService equipmentService;

    @Override
    @RequestMapping(value = CREATE_MAPPING, method = RequestMethod.POST)
    public @ResponseBody
    Equipment create(@RequestBody Equipment entity) {
        return equipmentService.create(entity);
    }

    @Override
    @RequestMapping(value = UPDATE_MAPPING, method = RequestMethod.POST)
    public @ResponseBody
    Response update(@RequestBody Equipment entity) {
        Boolean isUpdated = equipmentService.update(entity);
        return makeResponse(isUpdated, Operation.UPDATE, Equipment.class);
    }

    @Override
    @RequestMapping(value = FETCH_MAPPING, method = RequestMethod.POST)
    public @ResponseBody
    List<Equipment> fetchAll() {
        List<Equipment> equipments = equipmentService.fetchAll();
        return equipments;
    }

    @Override
    @RequestMapping(value = FETCH_BY_RANGE_MAPPING, method = RequestMethod.POST)
    public @ResponseBody
    List<Equipment> fetchByRange(@PathVariable(FROM_STRING_LITERAL) int from, @PathVariable(TO_STRING_LITERAL) int to) {
        List<Equipment> equipments = equipmentService.fetchByRange(new Range(from, to));
        return equipments;
    }

    @Override
    @RequestMapping(value = FETCH_BY_ID_MAPPING, method = RequestMethod.POST)
    public @ResponseBody
    Equipment fetchById(@PathVariable(ID_STRING_LITERAL) Long aLong) {
        Equipment equipment = equipmentService.fetchById(aLong);
        return equipment;
    }

    @Override
    @RequestMapping(value = REMOVE_MAPPING, method = RequestMethod.POST)
    public @ResponseBody
    Response remove(@RequestBody Equipment... entities) {
        Boolean isRemoved = equipmentService.remove(entities);
        return makeResponse(isRemoved, Operation.DELETE, Equipment.class);
    }
}
