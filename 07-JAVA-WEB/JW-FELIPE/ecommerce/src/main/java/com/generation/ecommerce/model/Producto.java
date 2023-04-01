package com.generation.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
	
	@Id//el campo id es la primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
	//el campo id sera generado automaticamente por la DB
    @Column(name="id", unique = true, nullable = false) 
	//especifica el nombre de la columna en la DB
	// Attributes
	private Long id;
	private String nombre;
	private String descripcion;
	private String URL_Imagen;
	private Double precio;
//	private int cantidad = 0;
	

	// Constructor vacio para el Jackson (serializar o deserealizar un
	// objeto JAVA a JSON)
	public Producto() {
		
	}

	//Constructor con todos los campos
	public Producto(Long id, String nombre, String descripcion, String URL_Imagen, Double precio) {
		
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.URL_Imagen = URL_Imagen;
		this.precio = precio;
//		this.cantidad = 0;
	}
	

	public Producto(Long id, String nombre, Double precio) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
//		this.cantidad = 0;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getURL_Imagen() {
		return URL_Imagen;
	}

	public void setURL_Imagen(String uRL_Imagen) {
		URL_Imagen = uRL_Imagen;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", URL_Imagen="
				+ URL_Imagen + ", precio=" + precio + "]";
	}

//	public int getCantidad() {
//		return cantidad;
//	}
//
//	public void setCantidad(int cantidad) {
//		this.cantidad = cantidad;
//	}
//	
//	public void aumentar() {
//		this.cantidad ++;
//	}
	
	
}
