package com.thesis.service.user;

import com.thesis.model.account.User;

import java.util.List;

public interface UserService {

    boolean isUserAlreadyExist(User user);

    User createUser(User user);

    User editUser(User user);

    User loginUser(User user);

    User signUpUser(User user);

    List<User> fetchAllUsers();

    User fetchUserById(Long userId);

    Boolean removeGroupUser(List<User> users);
}
