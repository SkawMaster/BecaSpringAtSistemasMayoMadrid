package com.atsistemas.persistencia;

import org.springframework.jdbc.core.JdbcTemplate;

import com.atsistemas.entidades.Persona;
import com.atsistemas.persistencia.spring.jdbc.PersonaRowMapper;

public class PersonaDao {

	private JdbcTemplate jdbcTemplate;
	private PersonaRowMapper rowMapper;
	
	public PersonaDao(JdbcTemplate jdbcTemplate, PersonaRowMapper rowMapper) {
		super();
		this.jdbcTemplate = jdbcTemplate;
		this.rowMapper = rowMapper;
	}

	public void insert(Persona persona) {
		jdbcTemplate.update("INSERT INTO APP.PERSONAS (nombre) VALUES (?)", persona.getNombre());
	}
	
	public Persona selectByNombre(String nombre){
		return jdbcTemplate.queryForObject("SELECT * FROM APP.PERSONAS WHERE NOMBRE = ?", rowMapper, nombre);
	}

}
