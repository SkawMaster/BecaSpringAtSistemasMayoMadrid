package com.atsistemas.ejercicio2;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.atsistemas.ejercicio2.persistencia.impl.ConsultaPersonaDaoImpl;

@Configuration
@ComponentScan(basePackages={"com.atsistemas.ejercicio2.servicio"})
public class Configuracion {

	@Bean
	public DataSource dataSourceConsulta(){
		BasicDataSource ds = new BasicDataSource();
		ds.setUrl("jdbc:derby://localhost:3300/Ejercicio2");
		ds.setUsername("pepito");
		ds.setPassword("juanito");
		return ds;
	}
	
	@Bean
	public DataSource dataSourceAdministracion(){
		BasicDataSource ds = new BasicDataSource();
		ds.setUrl("jdbc:derby://localhost:3300/Ejercicio2");
		ds.setUsername("root");
		ds.setPassword("root");
		return ds;
	}
	
	/*@Bean
	public ConsultaPersonaDaoImpl consultaPersonaDaoImpl(){
		return new ConsultaPersonaDaoImpl(dataSourceConsulta());
	}*/
	
	@Bean
	@Autowired
	@Qualifier("dataSourceConsulta")
	public ConsultaPersonaDaoImpl consultaPersonaDaoImpl(DataSource ds){
		return new ConsultaPersonaDaoImpl(ds);
	}
	
}
