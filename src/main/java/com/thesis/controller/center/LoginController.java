package com.thesis.controller.center;

import com.thesis.model.User;
import com.thesis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"","/home", "/index", "/main", "/login"}, method = RequestMethod.POST)
    public String login(@Valid @ModelAttribute("user") User user, BindingResult result, Model model, HttpSession session){

        User userInfo = userService.loginUser(user);

        if(userInfo == null){
            model.addAttribute("loginError", true);
            return "center/login";
        }

        session.setAttribute("activePersonnel", userInfo);
        return "redirect:dashboard";
    }

    @RequestMapping(value = {"","/home", "/index", "/main", "/login"}, method = RequestMethod.GET)
    public String renderLogin(@ModelAttribute("user") User user, Model model){
        return "center/login";
    }
}
