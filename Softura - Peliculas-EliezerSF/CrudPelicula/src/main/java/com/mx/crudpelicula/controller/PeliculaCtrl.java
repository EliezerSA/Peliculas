package com.mx.crudpelicula.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mx.crudpelicula.dominio.Pelicula;
import com.mx.crudpelicula.servicio.PeliculaServ;

//Los siguientes metodos son usando arquitectura MVC para visualizar en HTML,
//mismos que estan en la carpeta resources>templates
@Controller
@RequestMapping("ctrl/pelicula")
public class PeliculaCtrl {

	@Autowired
	PeliculaServ peliculaServ;

	@GetMapping("inicio")
	public String inicio(Model model) {

		var lista= peliculaServ.listar();
		model.addAttribute("listaV",lista);
		return "index";
	}

	//Secciones para Alta, Editar y Eliminar
	
	//Alta
	@GetMapping("altaPelicula")
	public String altaPelicula(Pelicula pelicula) {
		return "alta";
	}
	@PostMapping("alta")
	public String alta(Pelicula pelicula) {
		peliculaServ.guardar(pelicula);
		return "redirect:/ctrl/pelicula/inicio";
	}
	
	//Editar
	@GetMapping("/abrirEditar/{id}")//Inyeccion
	public String abrirEditar(Pelicula pelicula, Model model) {
		System.out.println("Pelicula a editar -->" + pelicula);
		pelicula = peliculaServ.buscar(pelicula);
		System.out.println("Pelicula buscada -->" + pelicula);
		model.addAttribute("pelicula", pelicula);
		return "editar";
	}
	@PostMapping("editar")
	public String editar(Pelicula pelicula) {
		
		peliculaServ.editar(pelicula);
		return "redirect:/ctrl/pelicula/inicio";
	}
	
	@GetMapping("/abrirEliminar/{id}")
	public String abrirEliminar(Pelicula pelicula, Model model) {
		pelicula = peliculaServ.buscar(pelicula);
		model.addAttribute("pelicula", pelicula);
		return "eliminar";
	}
	@PostMapping("eliminar")
	public String eliminar(Pelicula pelicula) {
		peliculaServ.eliminar(pelicula);
		return "redirect:/ctrl/pelicula/inicio";
	}
}

//By Eliezer Santiago Fuentes