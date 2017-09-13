package com.thesis.controller.profiles.management.cheaf.accountmanagement;

import com.thesis.model.account.User;
import com.thesis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getUsersView(Model model) {

        List<User> allUsers = userService.fetchAllUsers();
        model.addAttribute("all-users", allUsers);
        return "users";
    }

    @RequestMapping(value = "/users/{user-id}", method = RequestMethod.GET)
    public String getUserInfo(@PathVariable("user-id") Long userId, Model model) {

        User user = userService.fetchUserById(userId);
        model.addAttribute("requested-user", user);

        return "user";
    }


    @RequestMapping(value = "edit-user/{user-id}")
    public String postChangeUserInfo(@Valid @ModelAttribute("user") User user, Model model, BindingResult result, HttpSession sesison) {
        User editedUser = userService.editUser(user);
        model.addAttribute("edited-user", editedUser);
        return "edited-user";
    }
}
