package com.atsistemas.ejercicio.persistencia;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.atsistemas.ejercicio.entidades.Factura;

@Repository
public class JdbcFacturaDao implements FacturaDao{

	private DataSource datasource;
	
	public JdbcFacturaDao(DataSource datasource) {
		super();
		this.datasource = datasource;
	}

	@Override
	public void delete(Integer arg0) {
		// TODO Auto-generated method stub
		try {
			datasource.getConnection().prepareStatement("DELETE FROM FACTURAS WHERE ID = ?");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public void save(Factura arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Factura selectById(Integer arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Factura arg0) {
		// TODO Auto-generated method stub
		
	}

}
