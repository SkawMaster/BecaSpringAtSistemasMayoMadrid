package com.atsistemas.entidades;

public class PersonaBuilder {

	private String nombre;
	private int id;
	
	public PersonaBuilder setNombre(String nombre){
		this.nombre = nombre;
		return this;
	}
	
	public PersonaBuilder setId(int id){
		this.id = id;
		return this;
	}
	
	public Persona build(){
		Persona persona = new Persona();
		persona.setId(id);
		persona.setNombre(nombre);
		return persona; 
	}
	
}
