package com.atsistemas;

import java.util.Locale;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Aplicacion {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		System.out.println(context.getMessage("aplicacion.saludo", new String[]{"Victor"}, Locale.getDefault()));
		
	}

}
