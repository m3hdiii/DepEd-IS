package com.thesis.controller.profile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController {

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String profileGet(){
        return "center/profile";
    }

    @RequestMapping (value = "/edituserprofile", method = RequestMethod.GET)
    public String editUserProfile() { return "center/edituserprofile"; }

    @RequestMapping(value = {"/dashboard"}, method = RequestMethod.GET)
    public String showHome(){
        return "center/dashboard";
    }
}
