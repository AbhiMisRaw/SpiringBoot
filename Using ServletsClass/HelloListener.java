package com.example.SprigBootHelloWolrd.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class HelloListener implements ServletContextListener {
    @Override
    public void contextDestroyed(ServletContextEvent servContEvent){
        System.out.println("Servlet Context Destroyed");
    }
    @Override
    public void contextInitialized(ServletContextEvent servContEvent){
        System.out.println("Servlet Context Initialized");
    }
}
