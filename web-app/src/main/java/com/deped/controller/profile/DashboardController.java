package com.deped.controller.profile;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DashboardController {

    private static final String PROFILE = "profile";
    private static final String DASHBOARD = "dashboard";

    @RequestMapping(value = PROFILE, method = RequestMethod.GET)
    public String profileGet() {
        return "center/profile";
    }

    @RequestMapping(value = DASHBOARD, method = RequestMethod.GET)
    public String showHome() {
        return "center/dashboard";
    }
}