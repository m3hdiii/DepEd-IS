package com.deped.config;

import com.deped.log.Log4jBootstrap;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Log4jRestAppContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        String contextName = sce.getServletContext().getServletContextName();
        Log4jBootstrap.loader(contextName);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}