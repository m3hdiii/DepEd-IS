package com.thesis.controller.login;

import com.thesis.model.account.User;
import com.thesis.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"", "/home", "/index", "/main", "/login"}, method = RequestMethod.GET)
    public String renderLogin(@ModelAttribute("user") User user) {
        return "center/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public void checkLogin(@RequestBody User user) {
        userService.loginUser(user);
    }
}
