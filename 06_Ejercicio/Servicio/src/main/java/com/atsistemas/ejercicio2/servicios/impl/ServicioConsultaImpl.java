package com.atsistemas.ejercicio2.servicios.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atsistemas.ejercicio2.persistencia.ConsultaPersonaDao;
import com.atsistemas.ejercicio2.servicios.ServicioConsulta;

@Service
public class ServicioConsultaImpl implements ServicioConsulta {

	private ConsultaPersonaDao consultaPersonaDao;
	
	@Autowired
	public ServicioConsultaImpl(ConsultaPersonaDao consultaPersonaDao) {
		super();
		this.consultaPersonaDao = consultaPersonaDao;
	}

	public void buscarPersona(String nombre) {
		consultaPersonaDao.selectPersonaByNombre(nombre);

	}

}
