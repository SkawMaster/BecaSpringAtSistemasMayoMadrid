package com.atsistemas;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atsistemas.entidades.Persona;
import com.atsistemas.persistencia.PersonaDao;

public class Aplicacion {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfiguracionDB.class);
		
		PersonaDao dao = context.getBean(PersonaDao.class);
		
		dao.insert(new Persona("Victor"));
		
		System.out.println(dao.selectByNombre("Victor").getNombre());
	}
}
