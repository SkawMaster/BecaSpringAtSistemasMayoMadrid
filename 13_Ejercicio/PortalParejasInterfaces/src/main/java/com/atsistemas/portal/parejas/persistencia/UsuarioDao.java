package com.atsistemas.portal.parejas.persistencia;

import java.util.List;

import com.atsistemas.portal.parejas.entidades.Usuario;

public interface UsuarioDao {
	//Guardar
	Usuario save(Usuario usuario);
	
	//Consultar por login y password
	Usuario findByLoginAndPassword(String login, String password);
	
	//Consultar por login
	Usuario findOne(String login);
	
	//Borrar
	void delete(Usuario usuario);
	
	//Consultar todos los usuarios
	List<Usuario> finAll();
}
