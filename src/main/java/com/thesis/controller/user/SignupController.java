package com.thesis.controller.user;

import com.thesis.model.account.Gender;
import com.thesis.model.account.User;
import com.thesis.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.beans.PropertyEditorSupport;

/**
 * Created by mehdi on 7/7/17.
 */
@Controller
@RequestMapping(value="/")
public class SignupController {

    @Autowired
    private UserService userService;

    @RequestMapping(value="signup", method = RequestMethod.POST)
    public String signup(@RequestBody User user) {
        System.out.println(user.getUsername());
        return null;
    }

    @RequestMapping(value="signup", method = RequestMethod.GET)
    public String renderSignup(@Valid @ModelAttribute("user1") User user, Model model) {
        model.addAttribute("genderList", Gender.values());
        return "center/signup";
    }


    @InitBinder
    public void genderBinder(WebDataBinder dataBinder) {
        dataBinder.registerCustomEditor(Gender.class, new PropertyEditorSupport() {
            @Override
            public void setAsText(String value) throws IllegalArgumentException {
                if(value == null || "".equals(value))
                    return;

                setValue(Gender.valueOf(value));
            }

            @Override
            public String getAsText() {
                if(getValue() == null)
                    return "";
                return ((Gender) getValue()).name();
            }
        });
    }
}
