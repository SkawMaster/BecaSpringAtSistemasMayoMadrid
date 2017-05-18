package com.atsistemas.portal.parejas.servicios;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atsistemas.portal.parejas.entidades.Usuario;
import com.atsistemas.portal.parejas.persistencia.UsuarioDao;

@Service
public class BasicServicio implements Servicio {

	private UsuarioDao usuarioDao;
	
	@Autowired
	public BasicServicio(UsuarioDao usuarioDao) {
		super();
		this.usuarioDao = usuarioDao;
	}

	public Collection<Usuario> buscarAmistades(Usuario arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Usuario buscarIdeal(Usuario arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public void darDeBajaUsuario(Usuario arg0) {
		// TODO Auto-generated method stub
		
	}

	public void login(String arg0, String arg1) {
		// TODO Auto-generated method stub
		
	}

	public Usuario obtenerInformacionDeUsuario(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void registroUsuario(Usuario arg0) {
		usuarioDao.save(arg0);
		//Mandar correo electronico
	}

}
