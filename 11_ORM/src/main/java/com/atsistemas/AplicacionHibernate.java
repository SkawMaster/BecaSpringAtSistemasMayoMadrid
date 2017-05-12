package com.atsistemas;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atsistemas.entidades.Persona;
import com.atsistemas.persistencia.HibernatePersonaDao;

public class AplicacionHibernate {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfiguracionHibernate.class);
		
		HibernatePersonaDao dao = context.getBean(HibernatePersonaDao.class);
		
		dao.insert(new Persona("Victor"));
		
		System.out.println(dao.selectByNombre("Victor").getNombre());
	}
}
