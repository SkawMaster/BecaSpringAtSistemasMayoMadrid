package com.atsistemas.portal.parejas.servicios;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.atsistemas.portal.parejas.entidades.Usuario;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ConfiguracionTest.class })
public class BasicServicioConValidacionesTest {

	@Autowired
	Servicio target;
	
	@Autowired
	@Qualifier("usuarioValido")
	Usuario usuarioValido;
	
	@Autowired
	@Qualifier("usuarioInValido")
	Usuario usuarioInValido;
	
	@Test
	public void testRegistrarUsuarioValido() {
		target.registroUsuario(usuarioValido);
	}
	
	@Test(expected=RuntimeException.class)
	public void testRegistrarUsuarioNoValido() {
		target.registroUsuario(usuarioInValido);
	}

}
