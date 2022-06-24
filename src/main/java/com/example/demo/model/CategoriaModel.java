package com.example.demo.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="Categorias")
public class CategoriaModel  {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="id")
    private int id;
	
	@Column(name="nombre")
	@Size(min=3, message="Debe tener al menos 3 caracteres")
	@NotNull
	private String nombre;
	
	@Column(name="descripcion")
	@Size(min=10, message="Debe tener al menos 10 caracteres")
	@NotNull
	private String descripcion;


	@Column(name="estado")
	@Size(max=1, message="Debe tener maximo 1 caracter")
	@NotNull
	private String estado;
	
	public CategoriaModel(int id, String nombre, String descripcion, String estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.estado = estado;
	}

	public CategoriaModel() {
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
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", estado=" + estado + "]";
	}
	
}

