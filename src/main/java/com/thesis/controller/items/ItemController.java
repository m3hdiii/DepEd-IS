package com.thesis.controller.items;

import com.thesis.model.Response;
import com.thesis.model.ResponseStatus;
import com.thesis.model.items.semigoods.Item;
import com.thesis.repository.utils.Range;
import com.thesis.service.items.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/register-item", method = RequestMethod.GET)
    public String registerItemView() {
        return "processing/register-item";
    }

    @RequestMapping(value = "register-item", method = RequestMethod.POST)
    public Response registerItem(@RequestBody Item item) {
        Item itemPersisted = itemService.create(item);
        if (itemPersisted == null || itemPersisted.getItemId() == null) {
            return new Response(ResponseStatus.FAILED, "Item could not get created");
        }

        return new Response(ResponseStatus.SUCCESSFUL, "Item successfully Created");
    }

    @RequestMapping(value = "update-item", method = RequestMethod.POST)
    public Response updateItem(@RequestBody Item item) {
        Boolean isUpdated = itemService.update(item);
        if (isUpdated == null || !isUpdated) {
            return new Response(ResponseStatus.FAILED, "Item could not get updated");
        }
        return new Response(ResponseStatus.SUCCESSFUL, "Item successfully updated");
    }

    @RequestMapping(value = "items", method = RequestMethod.POST)
    public @ResponseBody
    List<Item> showAllItems() {
        List<Item> items = itemService.fetchAll();
        return items;
    }

    @RequestMapping(value = "item/{from}-{to}")
    public List<Item> showItems(@PathVariable int from, @PathVariable int to) {
        List<Item> items = itemService.fetchByRange(new Range(from, to));
        return items;
    }
}

/*
[
  {
    "itemId": null,
    "name": "paper",
    "description": "paper description",
    "itemType": "GOODS",
    "visibility": "EVERYONE",
    "threshold": 1000,
    "quantity": 100000,
    "requests": null,
    "creationDate": 1506397258288,
    "brand": {
      "brandId": null,
      "name": "amano",
      "description": "amano desc",
      "contactNumber": "09064403211",
      "contactNumber2": "09878787871",
      "centralOfficeAddress": "Manila makati",
      "serviceCenterAddress": "Baguio Bakakeng",
      "items": null
    },
    "material": "MONOBLOCK"
  },
  {
    "itemId": null,
    "name": "paper",
    "description": "paper description",
    "itemType": "GOODS",
    "visibility": "EVERYONE",
    "threshold": 1000,
    "quantity": 100000,
    "requests": null,
    "creationDate": 1506397258288,
    "brand": {
      "brandId": null,
      "name": "amano",
      "description": "amano desc",
      "contactNumber": "09064403211",
      "contactNumber2": "09878787871",
      "centralOfficeAddress": "Manila makati",
      "serviceCenterAddress": "Baguio Bakakeng",
      "items": null
    },
    "material": "MONOBLOCK"
  },
  {
    "itemId": null,
    "name": "paper",
    "description": "paper description",
    "itemType": "GOODS",
    "visibility": "EVERYONE",
    "threshold": 1000,
    "quantity": 100000,
    "requests": null,
    "creationDate": 1506397258288,
    "brand": {
      "brandId": null,
      "name": "amano",
      "description": "amano desc",
      "contactNumber": "09064403211",
      "contactNumber2": "09878787871",
      "centralOfficeAddress": "Manila makati",
      "serviceCenterAddress": "Baguio Bakakeng",
      "items": null
    },
    "material": "MONOBLOCK"
  }
]
 */