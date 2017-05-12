package com.atsistemas.persistencia.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.atsistemas.entidades.Persona;

public class PersonaRowMapper implements RowMapper<Persona> {

	public Persona mapRow(ResultSet rs, int posicion) throws SQLException {
		
		Persona persona = new Persona();
		
		persona.setNombre(rs.getString("NOMBRE"));
		
		return persona;
	}

}
