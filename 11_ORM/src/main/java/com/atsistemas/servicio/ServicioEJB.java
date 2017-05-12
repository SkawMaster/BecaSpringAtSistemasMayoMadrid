package com.atsistemas.servicio;

import javax.inject.Inject;

import com.atsistemas.entidades.Persona;
import com.atsistemas.persistencia.JpaPersonaDao;

//@Stateless
public class ServicioEJB {

	@Inject
	private JpaPersonaDao personaDao;
	
	public void setPersonaDao(JpaPersonaDao personaDao) {
		this.personaDao = personaDao;
	}

	public void guardarPersona(Persona persona){
		personaDao.save(persona);
	}
	
	public Persona consultarPersonaPorNombre(){
		return null;
	}
	
}
