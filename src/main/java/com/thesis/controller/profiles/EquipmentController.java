package com.thesis.controller.profiles;

import com.thesis.model.items.equipments.Equipment;
import com.thesis.service.data.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by mehdi on 7/18/17.
 */
@Controller
@RequestMapping(value="")
public class EquipmentController {

    @Autowired
    private EquipmentService equipmentService;

    @RequestMapping(value="/equipment", method = RequestMethod.GET)
    public String renderEquipment(Model model){
        List<Equipment> equipmentList = equipmentService.fetchItems();
        model.addAttribute("equipmentList", equipmentList);
        return "profile/equipment";
    }
}
