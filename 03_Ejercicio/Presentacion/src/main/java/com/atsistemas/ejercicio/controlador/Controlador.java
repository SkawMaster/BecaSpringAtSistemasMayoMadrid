package com.atsistemas.ejercicio.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.atsistemas.ejercicio.entidades.Factura;
import com.atsistemas.ejercicio.servicio.Servicio;
import com.atsistemas.ejercicio.vista.Vista;
import com.atsistemas.ejercicio.vista.VistaError;
import com.atsistemas.ejercicio.vista.VistaOk;

@Controller("controlador")
public class Controlador {
	
	@Autowired
	@Qualifier("servicio")
	private Servicio servicio;
	
	public Controlador(Servicio servicio) {
		super();
		this.servicio = servicio;
	}

	//URL
	public Vista altaFactura (Factura factura){
		try {
			//invocamos el servicio
			servicio.altaFactura(factura);
			return new VistaOk();
			
		} catch (Exception e) {
			return new VistaError(e);
		}
	}
	
	//URL
	public Vista bajaFactura (Integer id){
		servicio.bajaFactura(id);
		return new VistaOk();
	}
	public Vista modificacionFactura (Factura factura){
		servicio.modificacionFactura(factura);
		return new VistaOk();
	}
	public Vista busquedaPorId (Integer id){
		Factura factura = servicio.busquedaPorId(id);
		return new VistaOk(factura);
	}
	
}
