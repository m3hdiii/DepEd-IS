package com.thesis.controller.eqipment;

import com.thesis.controller.AbstractMainController;
import com.thesis.model.Response;
import com.thesis.model.items.equipments.Equipment;
import com.thesis.repository.utils.Range;
import com.thesis.service.equipment.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EquipmentController extends AbstractMainController<Equipment, Long> {


    @Autowired
    private EquipmentService equipmentService;

    @Override
    @RequestMapping(value = "create-equipment", method = RequestMethod.POST)
    public @ResponseBody
    Equipment create(@RequestBody Equipment entity) {
        return equipmentService.create(entity);
    }

    @Override
    @RequestMapping(value = "update-equipment", method = RequestMethod.POST)
    public @ResponseBody
    Response update(@RequestBody Equipment entity) {
        Boolean isUpdated = equipmentService.update(entity);
        return makeResponse(isUpdated, "equipment successfully updated", "equipment failed to update");
    }

    @Override
    @RequestMapping(value = "all-equipments", method = RequestMethod.GET)
    public @ResponseBody
    List<Equipment> fetchAll() {
        List<Equipment> equipments = equipmentService.fetchAll();
        return equipments;
    }

    @Override
    @RequestMapping(value = "all-equipments/{from}/{to}", method = RequestMethod.GET)
    public @ResponseBody
    List<Equipment> fetchByRange(@PathVariable("from") int from, @PathVariable("to") int to) {
        List<Equipment> equipments = equipmentService.fetchByRange(new Range(from, to));
        return equipments;
    }

    @Override
    @RequestMapping(value = "fetch-equipment/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Equipment fetchById(@PathVariable("id") Long aLong) {
        Equipment equipment = equipmentService.fetchById(aLong);
        return equipment;
    }

    @Override
    @RequestMapping(value = "remove-equipments", method = RequestMethod.POST)
    public @ResponseBody
    Response remove(@RequestBody Equipment... entities) {
        Boolean isRemoved = equipmentService.remove(entities);
        return makeResponse(isRemoved, "equipments successfully removed", "equipments failed to remove");
    }

    @Override
    @RequestMapping(value = "create-equipment2", method = RequestMethod.GET)
    public String renderCreatePage(Equipment entity, Model model) {
        return "";
    }

    @Override
    @RequestMapping(value = "all-equipments2", method = RequestMethod.GET)
    public String renderListPage(Model model) {
        return "";
    }

    @Override
    @RequestMapping(value = "update-equipment2", method = RequestMethod.GET)
    public String renderUpdatePage() {
        return "";
    }
}
