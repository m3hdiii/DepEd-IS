package com.thesis.controller.profiles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by mehdi on 7/18/17.
 */
@Controller
@RequestMapping(value = "")
public class Notification {

    @RequestMapping(value = "/notification", method = RequestMethod.GET)
    public String renderNotification() {
        return null;
    }
}
