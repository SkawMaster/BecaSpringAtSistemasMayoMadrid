package com.atsistemas.entidades;

public class PruebaBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonaBuilder builder = new PersonaBuilder();
		
		builder
			.setId(1)
			.setNombre("victor");
		
		builder.build();
		builder.build();
		
		builder.setId(2);
		
		builder.build();
		builder.build();
		builder.build();
		builder.build();
	}

}
