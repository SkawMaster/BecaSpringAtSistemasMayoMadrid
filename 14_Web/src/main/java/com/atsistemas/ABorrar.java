package com.atsistemas;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Servlet implementation class ABorrar
 */
@WebServlet("/ABorrar")
public class ABorrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Servicio servicio;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ABorrar() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
    	AnnotationConfigApplicationContext contexto = (AnnotationConfigApplicationContext) getServletContext().getAttribute(MiApplicationContextDeLosChinos.CONTEXTO_SPRING_DE_LOS_CHINOS);
    	servicio = contexto.getBean(Servicio.class);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombreSt = request.getParameter("nombre");
		int edad = Integer.parseInt(request.getParameter("edad"));
		
		String respuesta = servicio.altaUSuario();
		
		if (respuesta != null){
			
			request.setAttribute("dato", respuesta);
			
			
			request.getRequestDispatcher("/WEB-INF/resultado.jsp").forward(request, response);
			//response.getWriter().append("<html><head></head><body>Served at: </body>").append(request.getContextPath());
		} else {
			//response.getWriter().append("<html><head></head><body>Error: </body>").append(request.getContextPath());
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
