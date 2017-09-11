package com.deped.hibernate;

import com.thesis.model.account.User;
import com.thesis.repository.HibernateFacade;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import static org.junit.Assert.*;

import org.junit.Test;


public class UserTest {

    SessionFactory hibernateSessionFactory;
    Session session = null;

    @Test
    public void UserTransactionsTest() {
        try {
            hibernateSessionFactory = HibernateFacade.getSessionFactory();
            session = hibernateSessionFactory.openSession();
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        User user = new User();


//        assertTrue();
//        assertTrue(editUser());
//        assertTrue(saveUser());
//        assertTrue(saveUser());


    }

    private boolean saveUser() {

        return false;
    }

    private boolean deleteUser(User user) {

        return false;
    }

    private boolean editUser(User user) {

        return false;
    }

    private boolean deleteUser(Long userId) {

        return false;
    }


    private User fetchUser(Long userId) {

        return null;
    }
}
