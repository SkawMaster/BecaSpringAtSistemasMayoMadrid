package com.atsistemas.controladores;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import com.atsistemas.entidades.Usuario;
import com.atsistemas.servicios.Servicio;

@Controller
@RequestMapping("/Usuario")
public class Controlador {
	
	private Servicio servicio;
	
	@Autowired
	public Controlador(Servicio servicio) {
		super();
		this.servicio = servicio;
	}
	
	//Nada
	@RequestMapping("/Alta.html")
	public void procesarAltaUsuario(HttpServletRequest request, 
			HttpServletResponse response, 
			HttpSession session, 
			@Valid Usuario usuario, Errors errores,
			Model model){
		
		if(!errores.hasErrors()){
			//invoco el servicio
			
		}
		
		model.addAttribute("", new Object());
	}
	
	//Identificador de View
	@RequestMapping("/Baja.html")
	public String procesarBajaUsuario(Model model){
		System.out.println("en baja");
		model.addAttribute("dato", "Este mensaje se esta pasando desde el controlador a la vista");
		return "exito";
	}
	
	//../Usuario/Actualizar.html?id=12
	@RequestMapping("/Actualizar.html")
	public View procesarActualziarUsuario(@RequestParam int id){
		return null;
	}
	
	//Usuario/12 GET -> Consulta por id con id = 12
	
	@RequestMapping("/Consultar.html/{nombre}")
	public ModelAndView procesarConsultarUsuario(@PathVariable String nombre){
		return null;
	}
}
