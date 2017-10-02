package com.deped.restcontroller.user;

import com.deped.model.Response;
import com.deped.model.account.User;
import com.deped.repository.utils.Range;
import com.deped.restcontroller.AbstractMainRestController;
import com.deped.restcontroller.Operation;
import com.deped.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mehdi on 7/7/17.
 */

@RestController
public class UserRestController extends AbstractMainRestController<User, Long> {

    private static final String BASE_NAME = "user";
    private static final String CREATE_MAPPING = BASE_NAME + CREATE_PATTERN;
    private static final String UPDATE_MAPPING = BASE_NAME + UPDATE_PATTERN;
    private static final String FETCH_MAPPING = BASE_NAME + FETCH_PATTERN;
    private static final String FETCH_BY_RANGE_MAPPING = BASE_NAME + FETCH_PATTERN + RANGE_PATTERN;
    private static final String FETCH_BY_ID_MAPPING = BASE_NAME + FETCH_BY_ID_PATTERN;
    private static final String REMOVE_MAPPING = BASE_NAME + REMOVE_PATTERN;

    @Autowired
    private UserService userService;

    @Override
    @RequestMapping(value = CREATE_MAPPING, method = RequestMethod.POST)
    public @ResponseBody
    User create(@RequestBody User entity) {
        User savedUser = userService.create(entity);
        return savedUser;
    }

    @Override
    @RequestMapping(value = UPDATE_MAPPING, method = RequestMethod.POST)
    public @ResponseBody
    Response update(@RequestBody User entity) {
        Boolean isUpdated = userService.update(entity);
        return makeResponse(isUpdated, Operation.UPDATE, User.class);
    }

    @Override
    @RequestMapping(value = FETCH_MAPPING)
    public @ResponseBody
    List<User> fetchAll() {
        List<User> users = userService.fetchAll();
        return users;
    }


    @Override
    @RequestMapping(value = FETCH_BY_RANGE_MAPPING, method = RequestMethod.POST)
    public List<User> fetchByRange(@PathVariable(FROM_STRING_LITERAL) int from, @PathVariable(TO_STRING_LITERAL) int to) {
        List<User> users = userService.fetchByRange(new Range(from, to));
        return users;
    }

    @Override
    @RequestMapping(value = FETCH_BY_ID_MAPPING, method = RequestMethod.POST)
    public @ResponseBody
    User fetchById(@PathVariable(ID_STRING_LITERAL) Long aLong) {
        User user = userService.fetchById(aLong);
        return user;

    }

    @RequestMapping(value = REMOVE_MAPPING, method = RequestMethod.POST)
    @Override
    public Response remove(@RequestBody User... users) {
        Boolean isSuccessful = userService.remove(users);
        return makeResponse(isSuccessful, Operation.DELETE, User.class);
    }
}
