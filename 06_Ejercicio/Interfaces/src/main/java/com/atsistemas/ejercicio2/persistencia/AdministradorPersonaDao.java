package com.atsistemas.ejercicio2.persistencia;

import com.atsistemas.ejercicio2.entidades.Persona;

public interface AdministradorPersonaDao extends ConsultaPersonaDao {
	void insertPersona(Persona persona);
	void deletePersona(Persona persona);
	void updatePersona(Persona persona);
}
