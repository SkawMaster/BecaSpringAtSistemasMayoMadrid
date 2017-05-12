package com.atsistemas;

public class Proxy implements INegocio/*, INuevo*/{

	private INegocio target;
	//private INuevo = new Nuevo();
	//private Aspecto aspecto;
	
	public void setTarget(INegocio target) {
		this.target = target;
	}

	public String metodo(String dato) {
		System.out.println("Estoy en el proxy, pero como soy bueno, voy a dejar que se ejecute el negocio");
		return target.metodo(dato);
	}

	
	
}
