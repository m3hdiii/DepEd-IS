package com.thesis.controller.center;

import com.thesis.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 * Created by mehdi on 7/7/17.
 */
@Controller
@RequestMapping(value="/")
public class Signup {

    @RequestMapping(value="signup", method = RequestMethod.POST)
    public String signup(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession sesison) {

        return null;
    }

    @RequestMapping(value="signup", method = RequestMethod.GET)
    public String renderSignup(@Valid @ModelAttribute("user") User user, Model model) {
        return null;
    }
}
