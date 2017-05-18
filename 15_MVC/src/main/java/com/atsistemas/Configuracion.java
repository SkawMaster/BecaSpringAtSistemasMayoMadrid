package com.atsistemas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan({"com.atsistemas.controladores", "com.atsistemas.servicios"})
public class Configuracion {

	@Bean
	public ViewResolver viewResolver(){
		InternalResourceViewResolver internalResourceViewResolver 
				= new InternalResourceViewResolver("/WEB-INF/views/", ".jsp");
		
//		internalResourceViewResolver.setOrder(10);
//		internalResourceViewResolver.setViewClass(JstlView.class);
		
		return internalResourceViewResolver;
	}
	
}
