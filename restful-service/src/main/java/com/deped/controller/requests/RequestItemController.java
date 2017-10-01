package com.deped.controller.requests;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestItemController {

    @RequestMapping(value = "/request-item", method = RequestMethod.GET)
    public String itemRequest() {
        return "processing/request-item";
    }

}
