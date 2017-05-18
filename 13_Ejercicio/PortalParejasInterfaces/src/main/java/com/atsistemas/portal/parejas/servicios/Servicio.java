package com.atsistemas.portal.parejas.servicios;

import java.util.Collection;

import com.atsistemas.portal.parejas.entidades.Usuario;

public interface Servicio {
	void registroUsuario(Usuario usuario);

	void login(String login, String password);
	
	Usuario obtenerInformacionDeUsuario(String login);//Metodo potencialemnte peligroso, porque permite obtener la info de un user, sin haber pasado por el login

	void darDeBajaUsuario(Usuario usuario);

	Collection<Usuario> buscarAmistades(Usuario usuarioQueBusca);

	Usuario buscarIdeal(Usuario usuarioQueBusca); 
}
