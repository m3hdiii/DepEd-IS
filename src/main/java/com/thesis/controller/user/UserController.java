package com.thesis.controller.user;

import com.thesis.model.account.User;
import com.thesis.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehdi on 7/7/17.
 */

@Controller
@RequestMapping("")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"","/home", "/index", "/main", "/login"}, method = RequestMethod.GET)
    public String renderLogin(@ModelAttribute("user") User user, Model model){
        return "center/login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public void checkLogin(@RequestBody User user) {
        userService.loginUser(user);
    }

    @RequestMapping(value = "/delete-user", method = RequestMethod.POST)
    public void deleteGroupUser(@RequestBody List<User> users) {
        userService.removeGroupUser(users);
    }

    /*
    [

  {
    "userId": 1
  },
  {
    "userId": 2
  },
  {
    "userId": 3
  },
  {
    "userId": 4
  },
  {
    "userId": 5
  },
  {
    "userId": 6
  },
  {
    "userId": 7
  },
  {
    "userId": 8
  }
]
     */


    @RequestMapping(value = "testJson")
    public @ResponseBody
    List<User> getUsers() {

        List<User> users = new ArrayList<User>() {{
            add(new User(1L));
            add(new User(2L));
            add(new User(3L));
            add(new User(4L));
            add(new User(5L));
            add(new User(6L));
            add(new User(7L));
            add(new User(8L));
        }};

        return users;

    }
}
