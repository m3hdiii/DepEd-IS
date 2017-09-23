package com.thesis.repository.user;

import com.thesis.model.account.User;

import java.util.List;

/**
 * Created by PlanetClick on 3/9/2017.
 */
public interface UserRepository {

    User createUser(User user);

    User loginUserByUsername(User user);

    User loginUserByEmail(User user);

    List<User> findAllUsers();

    List<User> findUsers(Integer from, Integer to);

    boolean editUser(User user);

    User fetchUserById(Long userId);

    Boolean removeGroupUser(List<User> users);
}
