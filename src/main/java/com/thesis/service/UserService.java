package com.thesis.service;

import com.thesis.model.account.Personnel;
import com.thesis.model.account.User;

public interface UserService {

    boolean isPersonnelAlreadyExist(Personnel personnel);
    Personnel createPersonnel(Personnel personnel);


    User loginUser(User user);

    User signUpUser(User user);


}
