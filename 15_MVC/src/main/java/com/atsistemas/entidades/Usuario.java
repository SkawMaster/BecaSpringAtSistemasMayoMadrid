package com.atsistemas.entidades;

import javax.validation.constraints.NotNull;

public class Usuario {
	@NotNull
	private String nombre;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
