package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="Marcas")
public class MarcaModel {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="id")
    private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;

	public MarcaModel(int id, String nombre, String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public MarcaModel() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Marca [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	
}
