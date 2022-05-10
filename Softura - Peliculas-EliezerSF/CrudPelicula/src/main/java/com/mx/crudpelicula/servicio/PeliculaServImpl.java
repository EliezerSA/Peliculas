package com.mx.crudpelicula.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.crudpelicula.dao.PeliculaDao;
import com.mx.crudpelicula.dominio.Pelicula;

@Service
public class PeliculaServImpl implements PeliculaServ {

	@Autowired
	PeliculaDao peliculaDao;

	@Override
	public void guardar(Pelicula pelicula) {
		// Metodo guardar
		peliculaDao.save(pelicula);
	}

	@Override
	public void editar(Pelicula pelicula) {
		// Metodo editar
		peliculaDao.save(pelicula);
	}

	@Override
	public void eliminar(Pelicula pelicula) {
		// Metodo eliminar
		peliculaDao.delete(pelicula);
	}

	@Override
	public Pelicula buscar(Pelicula pelicula) {
		// Metodo buscar
		return peliculaDao.findById(pelicula.getId()).orElse(null);
	}

	@Override
	public List<Pelicula> listar() {
		// Metodo listar
		return (List<Pelicula>) peliculaDao.findAll();
	}

}

//By Eliezer Santiago Fuentes