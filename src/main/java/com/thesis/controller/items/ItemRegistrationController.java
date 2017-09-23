package com.thesis.controller.items;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ItemRegistrationController {
    @RequestMapping(value = "/register-item", method = RequestMethod.GET)
    public String itemRequest() {
        return "processing/register-item";
    }
}
