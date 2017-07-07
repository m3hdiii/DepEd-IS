package com.thesis.controller.center;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by mehdi on 7/7/17.
 */

@Controller
@RequestMapping(value="")
public class Home {

    @RequestMapping(value = {"/home", "", "/main"}, method = RequestMethod.GET)
    public String mainPageRender() {
        return "redirect:/signup";
    }
}
