package com.atsistemas.ejercicio2.persistencia.impl;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.atsistemas.ejercicio2.entidades.Persona;
import com.atsistemas.ejercicio2.persistencia.AdministradorPersonaDao;

@Repository
public class AdministradorPersonaDaoImpl extends ConsultaPersonaDaoImpl implements AdministradorPersonaDao{
	
	@Autowired
	public AdministradorPersonaDaoImpl(@Qualifier("dataSourceAdministracion") DataSource ds) {
		super(ds);
	}

	public void insertPersona(Persona persona) {
		try {
			Connection connection = ds.getConnection();
			connection.prepareStatement("INSERT INTO PERSONAS (nonmbre, apellido, edad) VALUES (?,?,?)");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void deletePersona(Persona persona) {
		// TODO Auto-generated method stub
		
	}

	public void updatePersona(Persona persona) {
		// TODO Auto-generated method stub
		
	}

}
