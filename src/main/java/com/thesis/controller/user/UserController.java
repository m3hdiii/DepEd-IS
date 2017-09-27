package com.thesis.controller.user;

import com.thesis.controller.AbstractMainController;
import com.thesis.model.Response;
import com.thesis.model.account.Gender;
import com.thesis.model.account.User;
import com.thesis.repository.utils.Range;
import com.thesis.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by mehdi on 7/7/17.
 */

@Controller
@RequestMapping("")
public class UserController extends AbstractMainController<User, Long> {

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

    @Override
    @RequestMapping(value = "signup", method = RequestMethod.POST)
    public @ResponseBody
    User create(User entity) {
        User savedUser = userService.create(entity);
        return savedUser;
    }


    @Override
    @RequestMapping(value = "update-user", method = RequestMethod.POST)
    public @ResponseBody
    Response update(User entity) {
        Boolean isUpdated = userService.update(entity);
        return makeResponse(isUpdated, "user successfully updated", "unable to update user");
    }

    @Override
    @RequestMapping(value = "fetch-users")
    public @ResponseBody
    List<User> fetchAll() {
        List<User> users = userService.fetchAll();
        return users;
    }


    @Override
    @RequestMapping(value = "fetch-users/{from}/{to}", method = RequestMethod.GET)
    public List<User> fetchByRange(@PathVariable("from") int from, @PathVariable("to") int to) {
        List<User> users = userService.fetchByRange(new Range(from, to));
        return users;
    }

    @Override
    @RequestMapping(value = "fetch-user/{user-id}", method = RequestMethod.GET)
    public @ResponseBody
    User fetchById(@PathVariable("user-id") Long aLong) {
        User user = userService.fetchById(aLong);
        return user;

    }

    @RequestMapping(value = "/remove-users", method = RequestMethod.POST)
    @Override
    public Response remove(@RequestBody User... users) {
        Boolean isSuccessful = userService.remove(users);
        return makeResponse(isSuccessful, "all users successfully removed", "removing users failed");
    }

    @Override
    @RequestMapping(value = "signup", method = RequestMethod.GET)
    public String renderCreatePage(@Valid @ModelAttribute("user1") User user, Model model) {
        model.addAttribute("genderList", Gender.values());
        return "center/signup";
    }

    @Override
    public String renderListPage(Model model) {
        return null;
    }

    @Override
    public String renderUpdatePage() {
        return null;
    }
}
