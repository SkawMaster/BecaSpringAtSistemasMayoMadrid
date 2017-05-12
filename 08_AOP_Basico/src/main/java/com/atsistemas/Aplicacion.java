package com.atsistemas;

public class Aplicacion {

	public static void main(String[] args) {
		
		ContextoDeLosChinos contextoDeLosChinos = new ContextoDeLosChinos();
		
		INegocio negocio = (INegocio) contextoDeLosChinos.getBean("Negocio");
	
		negocio.metodo("Victor");
		
	}

}
