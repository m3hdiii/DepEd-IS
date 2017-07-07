package com.thesis.service;

import com.thesis.model.Personnel;

public interface UserService {

    boolean isPersonnelAlreadyExist(Personnel personnel);
    Personnel createPersonnel(Personnel personnel);

}
