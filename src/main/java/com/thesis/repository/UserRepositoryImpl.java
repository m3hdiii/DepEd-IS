package com.thesis.repository;

import com.thesis.model.Personnel;
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
        return getPersonnelByUsername(personnel.getUsername());
    }

    @Override
    public Personnel createPersonnel(Personnel personnel) throws Exception {
//        Personnel createdPersonnel =  entityManager.merge(personnel);
////        entityManager.flush();
//        return createdPersonnel;

        return daoFacade.save(personnel);
    }
}
