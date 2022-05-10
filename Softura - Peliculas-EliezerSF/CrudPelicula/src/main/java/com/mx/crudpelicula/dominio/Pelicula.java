package com.mx.crudpelicula.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="M_PELICULA")
public class Pelicula {

	/*
	 * CREATE TABLE M_PELICULA( ID NUMBER PRIMARY KEY, PELICULA NVARCHAR2(100),
	 * IMAGEN NVARCHAR2(100), DURACION NUMBER, CLASIFICACION NVARCHAR2(100) );
	 */
	@Id
	@Column(name = "ID", columnDefinition = "NUMBER")
	int id;
	@Column(name = "PELICULA", columnDefinition = "NVARCHAR2(100)")
	String pelicula;
	@Column(name = "IMAGEN", columnDefinition = "NVARCHAR2(100)")
	String imagen;
	@Column(name = "DURACION", columnDefinition = "NUMBER")
	int duracion;
	@Column(name = "CLASIFICACION", columnDefinition = "NVARCHAR2(100)")
	String clasificacion;

	public Pelicula() {

	}

	public Pelicula(int id, String pelicula, String imagen, int duracion, String clasificacion) {

		this.id = id;
		this.pelicula = pelicula;
		this.imagen = imagen;
		this.duracion = duracion;
		this.clasificacion = clasificacion;
	}

	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", pelicula=" + pelicula + ", imagen=" + imagen + ", duracion=" + duracion
				+ ", clasificacion=" + clasificacion + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPelicula() {
		return pelicula;
	}

	public void setPelicula(String pelicula) {
		this.pelicula = pelicula;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

}

//By Eliezer Santiago Fuentes