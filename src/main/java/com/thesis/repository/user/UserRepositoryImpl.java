package com.thesis.repository.user;

import com.thesis.model.account.User;
import com.thesis.repository.utils.HibernateFacade;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mehdi on 3/17/17.
 */

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private HibernateFacade hibernateFacade;

    @Override
    public boolean isUserAlreadyExist(User user) {
        return false;
    }

    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User editUser(User user) {
        return null;
    }

    @Override
    public User loginUser(User user) {
        SessionFactory sessionFactory;
        Session hibernateSession = null;
        try {
            sessionFactory = hibernateFacade.getSessionFactory();
            hibernateSession = sessionFactory.openSession();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        User result = null;
        Transaction tx = null;
        try {
            tx = hibernateSession.beginTransaction();
            Query<User> query = hibernateSession.createNamedQuery("findByUsernamePassword", User.class);
            result = query.setParameter("username", "mehdi")
                    .setParameter("password", "123")
                    .getSingleResult();
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
        } finally {
            if (hibernateSession != null)
                hibernateSession.close();
        }

        return result;
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
