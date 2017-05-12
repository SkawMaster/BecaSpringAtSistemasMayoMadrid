package com.atsistemas;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.atsistemas.configuracion.Configuracion;

public class AplicacionConSpringJavaConfig {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);

	}

}
