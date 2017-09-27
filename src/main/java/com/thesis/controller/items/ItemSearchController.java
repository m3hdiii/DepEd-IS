package com.thesis.controller.items;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ItemSearchController {

    @RequestMapping(value = "/semi-expendables", method = RequestMethod.GET)
    public String getSemiExpendables() {
        return "items/semi-expendables";
    }

    @RequestMapping(value = "/goods", method = RequestMethod.GET)
    public String getGoods() {
        return "items/goods";
    }

    @RequestMapping(value = "/item-list", method = RequestMethod.GET)
    public String getAllItems() {
        return "items/item-list";
    }
}
