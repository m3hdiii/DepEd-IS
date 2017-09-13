package com.thesis.controller.profiles;

import com.thesis.model.items.semigoods.Item;
import com.thesis.service.data.ItemService;
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
@RequestMapping(value = "")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/item", method = RequestMethod.GET)
    public String renderItems(Model model) {
        List<Item> items = itemService.fetchItems();
        model.addAttribute("itemList", items);
        return "profile/item";
    }


    public String renderEquipments() {
        return null;
    }
}
