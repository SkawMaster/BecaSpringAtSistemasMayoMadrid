package com.atsistemas;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Application Lifecycle Listener implementation class MiApplicationContextDeLosChinos
 *
 */
@WebListener
public class MiApplicationContextDeLosChinos implements ServletContextListener {

    public static final String CONTEXTO_SPRING_DE_LOS_CHINOS = "contextoSpringdeLosChinos";

	/**
     * Default constructor. 
     */
    public MiApplicationContextDeLosChinos() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfiguracionSpring.class);
		arg0.getServletContext().setAttribute(CONTEXTO_SPRING_DE_LOS_CHINOS, context);
		
	}
	
}
