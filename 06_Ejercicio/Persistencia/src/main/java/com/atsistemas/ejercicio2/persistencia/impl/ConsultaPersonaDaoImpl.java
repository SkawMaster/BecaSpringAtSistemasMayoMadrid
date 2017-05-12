package com.atsistemas.ejercicio2.persistencia.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.atsistemas.ejercicio2.persistencia.ConsultaPersonaDao;

//@Repository
public class ConsultaPersonaDaoImpl implements ConsultaPersonaDao{

	protected DataSource ds;
	
	//@Autowired
	//@Qualifier("dataSourceConsulta")
	public ConsultaPersonaDaoImpl( DataSource ds) {
		super();
		this.ds = ds;
	}

	public void selectPersonaByNombre(String nombre) {
		// TODO Auto-generated method stub
		
	}

}
