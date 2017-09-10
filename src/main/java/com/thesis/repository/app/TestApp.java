package com.thesis.repository.app;

import com.thesis.repository.HibernateFacade;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestApp {

    public static void main(String[] args) {
        SessionFactory factory = HibernateFacade.getSessionFactory();
        Session session = factory.getCurrentSession();
        session.beginTransaction();
//        session.delete();

//        User user = new User();
//
//        session.save();
//
//        session.getTransaction().commit();
//
//        session.refresh();
    }
}
