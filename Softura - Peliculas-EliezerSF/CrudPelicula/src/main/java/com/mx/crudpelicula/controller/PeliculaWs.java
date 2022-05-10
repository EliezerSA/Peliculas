package com.mx.crudpelicula.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.crudpelicula.dominio.Pelicula;
import com.mx.crudpelicula.servicio.PeliculaServ;

@RestController
@RequestMapping("PeliculaWs")
@CrossOrigin
public class PeliculaWs {

	@Autowired
	PeliculaServ peliculaServ;

	// Link para acceder al metodo listar varia de acuerdo al servidor que se use
	// Usar Postman
	// http://localhost:4200/PeliculaWs/listar
	@GetMapping("listar")
	public List<Pelicula> listar() {
		var lista = peliculaServ.listar();
		return lista;
	}

	// Probar en Postman cada metodo

	// http://localhost:4200/PeliculaWs/buscar
	@PostMapping("buscar")
	public Pelicula buscar(@RequestBody Pelicula pelicula) {
		return peliculaServ.buscar(pelicula);
	}

	// Guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Pelicula pelicula) {
		peliculaServ.guardar(pelicula);
	}

	// Editar
	@PostMapping("editar")
	public void editar(@RequestBody Pelicula pelicula) {
		peliculaServ.editar(pelicula);
	}

	// Eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Pelicula pelicula) {
		peliculaServ.eliminar(pelicula);
	}

	//Los metodos anteriores corresponden alas peticiones rest del requerimiento
	//sin, embargo complemantare con html para visualizar en el navegador los datos
	
	//By Eliezer Santiago Fuentes
}
