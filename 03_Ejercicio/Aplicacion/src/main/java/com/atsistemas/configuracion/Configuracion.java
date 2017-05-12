package com.atsistemas.configuracion;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;

import com.atsistemas.ejercicio.entidades.Factura;
import com.atsistemas.ejercicio.negocio.Negocio;
import com.atsistemas.ejercicio.negocio.NegocioImpl;
import com.atsistemas.ejercicio.persistencia.FacturaDao;
import com.atsistemas.ejercicio.persistencia.MemoriaFacturaDao;
import com.atsistemas.ejercicio.servicio.Servicio;
import com.atsistemas.ejercicio.servicio.ServicioImpl;

@Configuration
@ComponentScan(basePackages="com.atsistemas")
@ImportResource("classpath:ApplicationContext.xml")
@Profile("desarrollo")
public class Configuracion {

	@Bean
	
	public Map<Integer, Factura> tablaFacturas(){
		return new HashMap<>();
	}
	
	@Bean
	@Autowired
	public FacturaDao facturaDao(Map<Integer, Factura> tablaFacturas){
		return new MemoriaFacturaDao(tablaFacturas);
	}
	
	@Bean
	@Autowired
	public Negocio negocio(FacturaDao facturaDao){
		return new NegocioImpl(facturaDao);
	}
	
	
	
	@Bean
	@Autowired
	public Servicio servicio(FacturaDao facturaDao, Negocio negocio){
		return new ServicioImpl(negocio, facturaDao);
	}
	
}
