package com.thesis.controller.eqipment;

import com.thesis.controller.AbstractMainController;
import com.thesis.model.Response;
import com.thesis.model.items.equipments.EquipmentInfo;
import com.thesis.service.eqipment.EquipmentInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EquipmentInfoController extends AbstractMainController<EquipmentInfo, Long> {

    @Autowired
    private EquipmentInfoService equipmentInfoService;

    @Override
    @RequestMapping(value = "create-equipment-info", method = RequestMethod.POST)
    public @ResponseBody
    EquipmentInfo create(@RequestBody EquipmentInfo entity) {
        return null;
    }

    @Override
    @RequestMapping(value = "update-equipment-info", method = RequestMethod.POST)
    public @ResponseBody
    Response update(@RequestBody EquipmentInfo entity) {
        return null;
    }

    @Override
    @RequestMapping(value = "all-equipment-info", method = RequestMethod.GET)
    public @ResponseBody
    List<EquipmentInfo> fetchAll() {
        return null;
    }

    @Override
    @RequestMapping(value = "all-equipment-info/{from}/{to}", method = RequestMethod.GET)
    public @ResponseBody
    List<EquipmentInfo> fetchByRange(@PathVariable("from") int from, @PathVariable("to") int to) {
        return null;
    }

    @Override
    @RequestMapping(value = "fetch-equipment-info/{id}", method = RequestMethod.GET)
    public @ResponseBody
    EquipmentInfo fetchById(@PathVariable("id") Long aLong) {
        return null;
    }

    @Override
    @RequestMapping(value = "remove-equipment-info", method = RequestMethod.POST)
    public @ResponseBody
    Response remove(@RequestBody EquipmentInfo... entities) {
        return null;
    }

    @Override
    @RequestMapping(value = "create", method = RequestMethod.GET)
    public String renderCreatePage(EquipmentInfo entity, Model model) {
        return null;
    }

    @Override
    @RequestMapping(value = "list-", method = RequestMethod.GET)
    public String renderListPage(Model model) {
        return null;
    }

    @Override
    @RequestMapping(value = "ssss", method = RequestMethod.GET)
    public String renderUpdatePage() {
        return null;
    }
}
