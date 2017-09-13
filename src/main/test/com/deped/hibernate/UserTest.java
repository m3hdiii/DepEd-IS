package com.deped.hibernate;

import com.thesis.model.account.AccountStatus;
import com.thesis.model.account.Gender;
import com.thesis.model.account.Position;
import com.thesis.model.account.User;
import com.thesis.model.location.City;
import com.thesis.model.location.Country;
import com.thesis.model.location.office.Department;
import com.thesis.model.location.office.Section;
import com.thesis.repository.HibernateFacade;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Date;


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

        User user = new User("mehdi", "123", AccountStatus.NOT_ACTIVE, "Mehdi", "Afsari",
                null, "mahdi.afsari@gmail.com", "09062658383", "09206110990", Gender.MALE,
                new Date(), new Date(), Position.HEAD, "Niroo Havayi, Tehran", "http://www.google.com",
                null, new Date(), "Amir Afsari", "Niroo Havayi Tehran", "09195541040", null, new Section("Develop", "Developer Section", new Department(), new Date()), null, null, (short) 5, 20, null, null, new City(), new Country());



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
