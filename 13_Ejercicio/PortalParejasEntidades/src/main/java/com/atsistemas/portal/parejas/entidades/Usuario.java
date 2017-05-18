package com.atsistemas.portal.parejas.entidades;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.atsistemas.portal.parejas.utilidades.Genero;

@Entity
@Access(AccessType.FIELD)
public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	/**
	 * PK
	 */
	@Id
	private String login;
	@Column(nullable=false)
	private String nombre;
	@Column(nullable=false)
	private String apellido;
	@Column(nullable=false)
	private String password;
	@Column(nullable=false)
	private String mail;
	/**
	 * Altura en centimetros
	 */
	@Column(nullable=false)
	private int altura;
	@Column(nullable=false)
	private int edad;
	@Column(nullable=false)
	private Genero genero;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	public Usuario(String nombre, String apellido, String login, String password, String mail, int altura, int edad,
			Genero genero) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.login = login;
		this.password = password;
		this.mail = mail;
		this.altura = altura;
		this.edad = edad;
		this.genero = genero;
	}
	public Usuario() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", login=" + login + ", password=" + password
				+ ", mail=" + mail + ", altura=" + altura + ", edad=" + edad + ", genero=" + genero + "]";
	}
}
