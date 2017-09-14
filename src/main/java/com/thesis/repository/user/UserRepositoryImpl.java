package com.thesis.repository.user;

import com.thesis.model.account.User;
import com.thesis.repository.utils.DaoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by mehdi on 3/17/17.
 */

@Repository
public class UserRepositoryImpl implements UserRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private DaoFacade daoFacade;

    @Override
    public boolean isUserAlreadyExist(User user) {
        return false;
    }

    @Override
    public User createUser(User user) {
        return daoFacade.save(user);
    }

    @Override
    public User editUser(User user) {
        return null;
    }

    @Override
    public User loginUser(User user) {
        User loginedUser = null;
        //FIXME pull from database
        if(user.getUsername().equals("mehdi") && user.getPassword().equals("123")){
            //loginedUser = new User("mehdi", "123", AccountStatus.ACTIVE, "Mehdi", "AfsariKashi", "", "mahdi.afsari@gmail.com", "09062658383", "", Gender.MALE, null, "Sr. Software Developer", "Engineers Hill", "kelid.ml", null, "Morteza AfsariKashi", "Tehran - Iran", "+989335787106", "", new Department("IT", "IT Department", "Sir. Harris"), new Section("Section 1", "Section 1 Description", null),new Role("Admin", "Description"), null);
        }
        return loginedUser;
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
