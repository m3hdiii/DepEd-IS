package com.deped.controller.eqipment;

import com.deped.controller.AbstractMainController;
import com.deped.controller.Operation;
import com.deped.model.Response;
import com.deped.model.items.equipment.Equipment;
import com.deped.repository.utils.Range;
import com.deped.service.equipment.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EquipmentController extends AbstractMainController<Equipment, Long> {

    private static final String BASE_NAME = "equipment";
    private static final String CREATE_MAPPING = BASE_NAME + CREATE_PATTERN;
    private static final String UPDATE_MAPPING = BASE_NAME + UPDATE_PATTERN;
    private static final String FETCH_MAPPING = BASE_NAME + FETCH_PATTERN;
    private static final String FETCH_BY_RANGE_MAPPING = BASE_NAME + FETCH_PATTERN + RANGE_PATTERN;
    private static final String FETCH_BY_ID_MAPPING = BASE_NAME + FETCH_BY_ID_PATTERN;
    private static final String REMOVE_MAPPING = BASE_NAME + REMOVE_PATTERN;
    private static final String SHOW_CREATE_MAPPING = CREATE_MAPPING;
    private static final String SHOW_LIST_MAPPING = BASE_NAME + SHOW_PREFIX;
    private static final String SHOW_UPDATE_MAPPING = UPDATE_MAPPING;


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
    @RequestMapping(value = FETCH_MAPPING, method = RequestMethod.GET)
    public @ResponseBody
    List<Equipment> fetchAll() {
        List<Equipment> equipments = equipmentService.fetchAll();
        return equipments;
    }

    @Override
    @RequestMapping(value = FETCH_BY_RANGE_MAPPING, method = RequestMethod.GET)
    public @ResponseBody
    List<Equipment> fetchByRange(@PathVariable(FROM_STRING_LITERAL) int from, @PathVariable(TO_STRING_LITERAL) int to) {
        List<Equipment> equipments = equipmentService.fetchByRange(new Range(from, to));
        return equipments;
    }

    @Override
    @RequestMapping(value = FETCH_BY_ID_MAPPING, method = RequestMethod.GET)
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

    @Override
    @RequestMapping(value = SHOW_CREATE_MAPPING, method = RequestMethod.GET)
    public String showCreatePage(Equipment entity, Model model) {
        return "";
    }

    @Override
    @RequestMapping(value = SHOW_LIST_MAPPING, method = RequestMethod.GET)
    public String showListPage(Model model) {
        return "";
    }

    @Override
    @RequestMapping(value = SHOW_UPDATE_MAPPING, method = RequestMethod.GET)
    public String showUpdatePage() {
        return "";
    }
}
