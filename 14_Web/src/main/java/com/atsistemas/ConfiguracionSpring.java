package com.atsistemas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguracionSpring {

	@Bean
	public Servicio servicio(){
		return new BasicServicio();
	}
	
}
