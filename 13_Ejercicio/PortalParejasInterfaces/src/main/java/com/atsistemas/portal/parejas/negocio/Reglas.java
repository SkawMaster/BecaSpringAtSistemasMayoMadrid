package com.atsistemas.portal.parejas.negocio;

import com.atsistemas.portal.parejas.entidades.Usuario;

public interface Reglas {
	boolean sonAfines(Usuario elQueBusca, Usuario candidato);
	
	boolean sonIdeal(Usuario elQueBusca, Usuario candidato);
}
