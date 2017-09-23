package com.thesis.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class IndexController {

    //now we have to say what url for opening the page using http get methos
    @RequestMapping(value = "/welcome-kevin-and-kieth", method= RequestMethod.GET)
    public String anyName(){
        //this refer to center folder and opens index.jsp
        //take note that you do not need to put .jsp at the end because the suffix will be added using this formula ....
        return "center/index";
    }


}
