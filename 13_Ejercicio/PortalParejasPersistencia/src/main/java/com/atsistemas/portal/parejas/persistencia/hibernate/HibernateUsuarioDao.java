package com.atsistemas.portal.parejas.persistencia.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.atsistemas.portal.parejas.entidades.Usuario;
import com.atsistemas.portal.parejas.persistencia.UsuarioDao;

@Repository
@Transactional
public class HibernateUsuarioDao implements UsuarioDao{

	private SessionFactory sessionFactory;
	
	@Autowired
	public HibernateUsuarioDao(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	public void delete(Usuario usuario) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.delete(usuario);
	}

	public List<Usuario> finAll() {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession.createQuery("from Usuario", Usuario.class).getResultList();
	}

	public Usuario findByLoginAndPassword(String login, String password) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Usuario> query = currentSession.createQuery("from Usuario u where u.login = :login and u.password = :password", Usuario.class);
		query.setParameter("login", login);
		query.setParameter("password", password);
		return query.uniqueResult();
	}

	public Usuario findOne(String login) {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession.find(Usuario.class, login);
	}

	public Usuario save(Usuario usuario) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.persist(usuario);
		return usuario;
	}

}
