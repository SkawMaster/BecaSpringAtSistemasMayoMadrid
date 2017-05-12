package com.atsistemas;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atsistemas.entidades.Persona;
import com.atsistemas.persistencia.PersonaDao;

public class AplicacionJpa {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfiguracionJPA.class);

		PersonaDao dao = context.getBean(PersonaDao.class);

		dao.save(new Persona("Victor"));

		System.out.println(dao.findByNombre("Victor").getNombre());
	}
}
