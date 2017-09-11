package com.thesis.repository;

import com.thesis.model.account.Personnel;
import com.thesis.model.account.User;
import com.thesis.repository.coordinator.DaoFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
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


    private Personnel getPersonnelByUsername(String username){
        Query q = entityManager.createNativeQuery(String.format("SELECT * FROM personnel WHERE username = '%s'", username), Personnel.class);
        List<Personnel> result = q.getResultList();
        return result != null && !result.isEmpty() ? result.get(0) : null;
    }

    @Override
    public Personnel isPersonnelAlreadyExist(Personnel personnel) {
        return getPersonnelByUsername(null/*personnel.getUsername()*/);
    }

    @Override
    public Personnel createPersonnel(Personnel personnel) throws Exception {
//        Personnel createdPersonnel =  entityManager.merge(personnel);
////        entityManager.flush();
//        return createdPersonnel;

        return daoFacade.save(personnel);
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
}
