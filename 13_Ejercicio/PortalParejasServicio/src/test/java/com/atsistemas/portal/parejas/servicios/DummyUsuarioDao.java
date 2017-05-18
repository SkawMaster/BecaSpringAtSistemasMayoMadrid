package com.atsistemas.portal.parejas.servicios;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.atsistemas.portal.parejas.entidades.Usuario;
import com.atsistemas.portal.parejas.persistencia.UsuarioDao;

@Repository
public class DummyUsuarioDao implements UsuarioDao {

	public void delete(Usuario arg0) {
		// TODO Auto-generated method stub

	}

	public List<Usuario> finAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Usuario findByLoginAndPassword(String arg0, String arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public Usuario findOne(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Usuario save(Usuario arg0) {
		return arg0;
	}

}
