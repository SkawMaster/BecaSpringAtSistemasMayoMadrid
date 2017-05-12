package com.atsistemas.ejercicio2.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atsistemas.ejercicio2.entidades.Persona;
import com.atsistemas.ejercicio2.persistencia.AdministradorPersonaDao;
import com.atsistemas.ejercicio2.persistencia.ConsultaPersonaDao;
import com.atsistemas.ejercicio2.servicios.ServicioAdministrador;

@Service
public class ServicioAdministradorImpl implements ServicioAdministrador {

	private AdministradorPersonaDao administradorPersonaDao;
	
	@Autowired
	public ServicioAdministradorImpl(AdministradorPersonaDao administradorPersonaDao) {
		super();
		this.administradorPersonaDao = administradorPersonaDao;
	}

	public void altaPersona(Persona persona) {
		administradorPersonaDao.insertPersona(persona);
		
	}

	public void bajaPersona(Persona persona) {
		administradorPersonaDao.deletePersona(persona);
		
	}

	public void modificacionPersona(Persona persona) {
		administradorPersonaDao.updatePersona(persona);
		
	}

	public void buscarPersona(String nombre) {
		administradorPersonaDao.selectPersonaByNombre(nombre);
		
	}

}
