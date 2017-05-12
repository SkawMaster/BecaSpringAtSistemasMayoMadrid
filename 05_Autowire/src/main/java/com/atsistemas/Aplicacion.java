package com.atsistemas;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Aplicacion {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		Persona persona = context.getBean("persona", Persona.class);
		
		persona.setNombre("");
		
		persona = context.getBean("persona", Persona.class);
		
		persona.getNombre();
		
		Persona persona1 = context.getBean("persona1", Persona.class);

	}

}
