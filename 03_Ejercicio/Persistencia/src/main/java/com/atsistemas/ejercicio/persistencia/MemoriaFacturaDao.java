package com.atsistemas.ejercicio.persistencia;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.atsistemas.ejercicio.entidades.Factura;

@Repository
public class MemoriaFacturaDao implements FacturaDao {

	private Map<Integer, Factura> tablaFacturas;
	
	//ID por constructor
	public MemoriaFacturaDao(Map<Integer, Factura> tablaFacturas) {
		super();
		this.tablaFacturas = tablaFacturas;
	}

	public void save(Factura factura) {
		tablaFacturas.put(factura.getId(), factura);
	}

	public void update(Factura factura) {
		tablaFacturas.put(factura.getId(), factura);

	}

	public void delete(Integer id) {
		tablaFacturas.remove(id);
	}

	public Factura selectById(Integer id) {
		return tablaFacturas.get(id);
	}

}
