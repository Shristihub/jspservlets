package com.training.listeners;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ContextAttListener
 *
 */
@WebListener
public class ContextAttListener implements ServletContextAttributeListener {

    /**
     * Default constructor. 
     */
    public ContextAttListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    public void attributeAdded(ServletContextAttributeEvent se)  { 
         System.out.println("Attribute added");
         System.out.println("Att name "+ se.getName());
         System.out.println("Att value "+ se.getValue());
    }

	/**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    public void attributeRemoved(ServletContextAttributeEvent se)  { 
    	System.out.println("Attribute removed");
    	   System.out.println("Att name "+ se.getName());
           System.out.println("Att value "+ se.getValue());
    }

	/**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(ServletContextAttributeEvent se)  { 
    	System.out.println("Attribute replaced");
    	   System.out.println("Att name "+ se.getName());
           System.out.println("Att value "+ se.getValue());
    }
	
}
