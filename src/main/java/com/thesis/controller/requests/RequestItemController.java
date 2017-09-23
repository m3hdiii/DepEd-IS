package com.thesis.controller.requests;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RequestItemController {

    @RequestMapping(value = "/request-item", method = RequestMethod.GET)
    public String itemRequest() {
        return "processing/request-item";
    }

}
