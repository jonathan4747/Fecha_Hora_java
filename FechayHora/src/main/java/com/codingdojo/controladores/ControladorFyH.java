package com.codingdojo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControladorFyH {
	@RequestMapping( value = "/", method = RequestMethod.GET )
	public String PaginaInicio() {
		return "index.jsp";
	}
	@RequestMapping( value = "/date", method = RequestMethod.GET )
	public String PaginaFecha() {
		return "indexFecha.jsp";
	}
	@RequestMapping( value = "/times", method = RequestMethod.GET )
	public String PaginaHora() {
		return "indexHora.jsp";
	}
	

}
