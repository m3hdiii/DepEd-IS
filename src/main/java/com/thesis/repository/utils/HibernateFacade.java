package com.thesis.repository.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.stereotype.Component;

@Component
public class HibernateFacade {
    private static volatile SessionFactory sessionInstance;

    private HibernateFacade() {
    }

    public static SessionFactory getSessionFactory() {
        if (sessionInstance == null) {
            synchronized (HibernateFacade.class) {
                if (sessionInstance == null) {
                    try {
                        StandardServiceRegistry standardRegistry =
                                new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
                        Metadata metaData = new MetadataSources(standardRegistry).getMetadataBuilder().build();
                        sessionInstance = metaData.getSessionFactoryBuilder().build();

                    } catch (Throwable th) {
                        System.err.println("Enitial SessionFactory creation failed" + th);
                        throw new ExceptionInInitializerError(th);
                    }
                }
            }
        }
        return sessionInstance;
    }


}
