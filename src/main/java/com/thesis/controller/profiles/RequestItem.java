package com.thesis.controller.profiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mehdi on 7/18/17.
 */

@Controller
@RequestMapping(value = "")
public class RequestItem {

    @RequestMapping(value = "")
    public String renderItems() {
        return null;
    }

    @RequestMapping(value = "")
    public String renderEquipments() {
        return null;
    }



}
