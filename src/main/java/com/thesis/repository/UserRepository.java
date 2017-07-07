package com.thesis.repository;

import com.thesis.model.Personnel;

/**
 * Created by PlanetClick on 3/9/2017.
 */
public interface UserRepository {


    Personnel isPersonnelAlreadyExist(Personnel personnel);
    Personnel createPersonnel(Personnel personnel) throws Exception;

}
