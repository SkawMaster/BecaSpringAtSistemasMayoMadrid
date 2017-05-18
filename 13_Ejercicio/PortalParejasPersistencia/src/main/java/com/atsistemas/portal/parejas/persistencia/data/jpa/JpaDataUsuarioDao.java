package com.atsistemas.portal.parejas.persistencia.data.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atsistemas.portal.parejas.entidades.Usuario;
import com.atsistemas.portal.parejas.persistencia.UsuarioDao;

public interface JpaDataUsuarioDao extends UsuarioDao, JpaRepository<Usuario, String> {

}
