package com.thesis.repository;

import com.thesis.model.Personnel;
import com.thesis.model.User;

/**
 * Created by PlanetClick on 3/9/2017.
 */
public interface UserRepository {


    Personnel isPersonnelAlreadyExist(Personnel personnel);
    Personnel createPersonnel(Personnel personnel) throws Exception;

    User loginUser(User user);

    User signUpUser(User user);

}
