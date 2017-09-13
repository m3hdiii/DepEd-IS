package com.thesis.service;


import com.thesis.model.account.User;
import com.thesis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean isUserAlreadyExist(User user) {
        return false;
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User editUser(User user) {
        return null;
    }

    @Override
    public User loginUser(User user) {
        return userRepository.loginUser(user);
    }

    @Override
    public User signUpUser(User user) {
        return null;
    }

    @Override
    public List<User> fetchAllUsers() {
        return null;
    }

    @Override
    public User fetchUserById(Long userId) {
        return null;
    }
}
