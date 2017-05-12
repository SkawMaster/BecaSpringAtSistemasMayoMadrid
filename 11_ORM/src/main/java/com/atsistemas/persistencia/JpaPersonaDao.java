package com.atsistemas.persistencia;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.atsistemas.entidades.Persona;

@Transactional
@Named
public class JpaPersonaDao {

	//Factoria se contextos de persisitencia
	@PersistenceContext
	private EntityManager entityManager;

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void save(Persona persona) {
		//Contexto de persistencia (factoria de beans de tipo entidad, api para interaccion con entorno persistente)
		entityManager.persist(persona);
	}

	public Persona findByNombre(String nombre) {
		TypedQuery<Persona> query = entityManager.createQuery("from Persona p where p.nombre = :nombre", Persona.class);
		query.setParameter("nombre", nombre);
		return query.getSingleResult();
	}

}
