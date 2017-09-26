package com.thesis.controller.items;

import com.thesis.model.Response;
import com.thesis.model.ResponseStatus;
import com.thesis.model.items.semigoods.Item;
import com.thesis.service.items.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class ItemRegistrationController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/register-item", method = RequestMethod.GET)
    public String registerItemView() {
        return "processing/register-item";
    }

    @RequestMapping(value = "register-item", method = RequestMethod.POST)
    public Response registerItem(@RequestBody Item item) {
        Boolean isCreated = itemService.createItem(item);
        if (isCreated == null || !isCreated) {
            return new Response(ResponseStatus.FAILED, "Item could not get created");
        }

        return new Response(ResponseStatus.SUCCESSFUL, "Item successfully Created");
    }

    @RequestMapping(value = "update-item", method = RequestMethod.POST)
    public Response updateItem(@RequestBody Item item) {
        Boolean isUpdated = itemService.updateItem(item);
        if (isUpdated == null || !isUpdated) {
            return new Response(ResponseStatus.FAILED, "Item could not get updated");
        }
        return new Response(ResponseStatus.SUCCESSFUL, "Item successfully updated");
    }

    @RequestMapping(value = "items", method = RequestMethod.POST)
    public List<Item> showAllItems() {
        List<Item> items = itemService.fetchAllItems();
        return items;
    }

    @RequestMapping(value = "item/{from}-{to}")
    public List<Item> showItems(@PathVariable int from, @PathVariable int to) {
        List<Item> items = itemService.fetchItem(from, to);
        return items;
    }
}
