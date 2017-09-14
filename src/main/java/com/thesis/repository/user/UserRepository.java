package com.thesis.repository.user;

import com.thesis.model.account.User;

import java.util.List;

/**
 * Created by PlanetClick on 3/9/2017.
 */
public interface UserRepository {


    boolean isUserAlreadyExist(User user);

    User createUser(User user);

    User editUser(User user);

    User loginUser(User user);

    User signUpUser(User user);

    List<User> fetchAllUsers();

    User fetchUserById(Long userId);
}
