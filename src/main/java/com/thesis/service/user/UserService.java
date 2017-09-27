package com.thesis.service.user;

import com.thesis.model.account.User;
import com.thesis.service.BaseService;

import java.util.List;

public interface UserService extends BaseService<User> {

    boolean isUserAlreadyExist(User user);


    User loginUser(User user);
}
