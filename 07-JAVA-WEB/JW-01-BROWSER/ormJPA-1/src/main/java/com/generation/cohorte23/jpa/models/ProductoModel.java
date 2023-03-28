package com.generation.cohorte23.jpa.models;

import java.util.ArrayList;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class ProductoModel {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
	private String nombre_producto;
	
//	private Long usuario_id;
	
//	Aqui se pone con que se va a relacionar, el many es el producto y el 
//	one es el usuario, asi que por la parte del usuario se pone una lista
//	para que quepan los productos y en producto se pone un objeto para que
//	quepa un usuario por producto ???, no sé ni por que se relaciones tbh
	@ManyToOne
	private UsuarioModel usuario;
	
	@OneToMany(mappedBy = "producto")
	private ArrayList<DetalleModel> detalle;
//	//////////////////////GETTER AND SETTER DE USUARIO////////////////
	public UsuarioModel getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}
//	//////////////////////////////////////////////////////////////////
	
	public ProductoModel() {
		super();
	}
	public ProductoModel(Long id, String nombre_producto, Long usuario_id) {
		super();
		this.id = id;
		this.nombre_producto = nombre_producto;
//		this.usuario_id = usuario_id;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre_producto() {
		return nombre_producto;
	}
	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}
//	public Long getUsuario_id() {
//		return usuario_id;
//	}
//	public void setUsuario_id(Long usuario_id) {
//		this.usuario_id = usuario_id;
//	}
	
	
}
