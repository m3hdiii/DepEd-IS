package com.thesis.controller;

import com.thesis.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class MainPageController {


    private static org.apache.logging.log4j.Logger logger = org.apache.logging.log4j.LogManager.getLogger(com.thesis.controller.MainPageController.class.getName());
    private static final String RECAPTCHA_PRIVATE_KEY = "6LffLPoSAAAAAJ5as9XGebSdcd0xJqJgd4w6gHHC";

    @Autowired
    private UserService userService;


    @RequestMapping(value = {"info"}, method = RequestMethod.GET)
    public String InfoPageRender() {
        return "public/congrat";
    }


}
