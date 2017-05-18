package com.atsistemas;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class ConfiguracionWeb implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		AnnotationConfigWebApplicationContext context 
				= new AnnotationConfigWebApplicationContext();
		context.setConfigLocation("com.atsistemas");
		
		DispatcherServlet dispatcherServlet = new DispatcherServlet(context);
		
		Dynamic addServlet = servletContext.addServlet("/", dispatcherServlet);
		
		addServlet.setLoadOnStartup(0);
		addServlet.addMapping("/");
		
	}

}
