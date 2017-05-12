package com.atsistemas;

public class Negocio implements INegocio {

	/* (non-Javadoc)
	 * @see com.atsistemas.INegocio#metodo(java.lang.String)
	 */
	public String metodo(String dato){
		System.out.println("Estoy en el bean negocio con dato = " + dato);
		return null;
	}
	
}
