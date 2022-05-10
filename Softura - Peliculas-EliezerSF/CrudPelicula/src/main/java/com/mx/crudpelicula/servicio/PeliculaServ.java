package com.mx.crudpelicula.servicio;

import java.util.List;

import com.mx.crudpelicula.dominio.Pelicula;

public interface PeliculaServ {

	public void guardar(Pelicula pelicula);

	public void editar(Pelicula pelicula);

	public void eliminar(Pelicula pelicula);

	public Pelicula buscar(Pelicula pelicula);

	public List<Pelicula> listar();
}

//By Eliezer Santiago Fuentes