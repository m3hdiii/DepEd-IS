package com.thesis.repository.user;

import com.thesis.model.account.User;
import com.thesis.repository.BaseRepository;

/**
 * Created by PlanetClick on 3/9/2017.
 */
public interface UserRepository extends BaseRepository<User> {
    User loginUser(User user, LoginMethod loginMethod);
}
