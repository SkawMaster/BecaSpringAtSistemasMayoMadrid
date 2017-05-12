package com.atsistemas;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.atsistemas.persistencia.PersonaDao;
import com.atsistemas.persistencia.spring.jdbc.PersonaRowMapper;

@Configuration
public class ConfiguracionDB {

	@Bean
	public DataSource dataSource(){
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setUrl("jdbc:derby://localhost:1527/Disney;create=true");
		basicDataSource.setUsername("admin");
		basicDataSource.setPassword("admin");
		basicDataSource.setDriverClassName("org.apache.derby.jdbc.ClientDriver40");
		return basicDataSource;
	}
	
	@Bean
	@Autowired
	public JdbcTemplate jdbcTemplate(DataSource dataSource){
		return new JdbcTemplate(dataSource);
	}
	
	@Bean
	public PersonaRowMapper personaRowMapper(){
		return new PersonaRowMapper();
	}
	
	@Bean
	@Autowired
	public PersonaDao personaDao(JdbcTemplate jdbcTemplate, PersonaRowMapper personaRowMapper){
		return new PersonaDao(jdbcTemplate, personaRowMapper);
	}
	
}
