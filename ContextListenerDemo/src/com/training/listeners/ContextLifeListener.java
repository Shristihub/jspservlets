package com.training.listeners;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ContextLifeListener
 *
 */
@WebListener
public class ContextLifeListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ContextLifeListener() {
    	System.out.println("Context Listener started");
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
    	System.out.println("Context destroyed");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent se)  { 
    	System.out.println("context initialized");
    	//use context to get value from web.xml
    	ServletContext context = se.getServletContext();
    	String mail = context.getInitParameter("mail");
    	//call setAttribute of SC to attach the value 
    	
    	context.setAttribute("newmail",mail);
    	
    }
	
}



