package com.atsistemas.portal.parejas.entidades.validaciones;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import com.atsistemas.portal.parejas.entidades.Usuario;

@Aspect
@Component
public class UsuarioValidador {

	@Around("execution(void com.atsistemas.portal.parejas.servicios.BasicServicio.registroUsuario(com.atsistemas.portal.parejas.entidades.Usuario)) && args(usuario)")
	//@Around("execution(void *.*.registroUsuario(..)) && args(usuario)")
	public void isEdadValido(ProceedingJoinPoint joinPoint, Usuario usuario){
		System.out.println("En el aspecto antes de ejecutar el target");
		if(usuario.getEdad() >= 18){
			try {
				joinPoint.proceed(new Object[]{usuario});
			} catch (Throwable e) {
				throw new RuntimeException(e);
			}
		} else {
			throw new RuntimeException("Se ha incumplido la validacion de edad, por ser " + usuario.getEdad() + " menor que 18");
		}
	}
}