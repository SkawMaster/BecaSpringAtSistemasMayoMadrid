package com.atsistemas.portal.parejas.servicios;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.atsistemas.portal.parejas.entidades.Usuario;
import com.atsistemas.portal.parejas.utilidades.Genero;

@Configuration
@ComponentScan(
		{
			"com.atsistemas.portal.parejas.servicios",
			"com.atsistemas.portal.parejas.entidades.validaciones"
		}
)
@EnableAspectJAutoProxy
public class ConfiguracionTest {

	@Bean
	public Usuario usuarioValido(){
		return  new Usuario("Victor", "Herrrero", "vherrero", "vherrero", "vherrero@psirng.com", 200, 22, Genero.MASCULINO);
	}
	
	@Bean
	public Usuario usuarioInValido(){
		return  new Usuario("Victor", "Herrrero", "vherrero", "vherrero", "vherrero@psirng.com", 200, 12, Genero.MASCULINO);
	}	
}
