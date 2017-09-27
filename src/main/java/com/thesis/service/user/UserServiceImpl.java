package com.thesis.service.user;


import com.thesis.model.account.User;
import com.thesis.repository.user.LoginMethod;
import com.thesis.repository.user.UserRepository;
import com.thesis.repository.utils.Range;
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
    public User loginUser(User user) {
        //TODO check and distinguish user login method using regex

        return userRepository.loginUser(user, LoginMethod.USERNAME);
    }

    @Override
    public User create(User entity) {
        return userRepository.create(entity);
    }

    @Override
    public Boolean update(User entity) {
        return userRepository.update(entity);
    }

    @Override
    public List<User> fetchAll() {
        return userRepository.fetchAll();
    }

    @Override
    public List<User> fetchByRange(Range range) {
        return userRepository.fetchByRange(range);
    }

    @Override
    public User fetchById(Object id) {
        return userRepository.fetchById(id);
    }

    @Override
    public Boolean remove(User... entities) {
        return userRepository.remove(entities);
    }
}
