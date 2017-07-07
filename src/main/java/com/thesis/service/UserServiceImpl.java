package com.thesis.service;


import com.thesis.model.Personnel;
import com.thesis.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean isPersonnelAlreadyExist(Personnel personnel) {
        return userRepository.isPersonnelAlreadyExist(personnel) != null ? true : false;
    }

    @Override
    public Personnel createPersonnel(Personnel personnel) {
        Personnel createdPersonnel;
        try {
            createdPersonnel = userRepository.createPersonnel(personnel);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return createdPersonnel;
    }
}
