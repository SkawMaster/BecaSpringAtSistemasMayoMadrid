package com.atsistemas.persistencia;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.transaction.annotation.Transactional;

import com.atsistemas.entidades.Persona;

@Transactional
public class HibernatePersonaDao {

	//Factoria se contextos de persisitencia
	private SessionFactory sessionFactory;
	
	public HibernatePersonaDao(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	public void insert(Persona persona) {
		//Contexto de persistencia (factoria de beans de tipo entidad, api para interaccion con entorno persistente)
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.persist(persona);
	}

	public Persona selectByNombre(String nombre) {
		Session currentSession = sessionFactory.getCurrentSession();
		//Sentencia HQL
		Query<Persona> query = currentSession.createQuery("from Persona p where p.nombre = :nombre", Persona.class);
		query.setParameter("nombre", nombre);
		return query.uniqueResult();
	}

}
