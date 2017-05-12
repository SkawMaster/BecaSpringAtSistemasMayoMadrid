package com.atsistemas.ejercicio2.servicios;

import com.atsistemas.ejercicio2.entidades.Persona;

public interface ServicioAdministrador extends ServicioConsulta {
	void altaPersona(Persona persona);
	void bajaPersona(Persona persona);
	void modificacionPersona(Persona persona);
}
