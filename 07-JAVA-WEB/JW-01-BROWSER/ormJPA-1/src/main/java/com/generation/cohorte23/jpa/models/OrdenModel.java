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
@Table(name = "orden")
public class OrdenModel {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
	private String nombre_orden;
	
	@ManyToOne
	private UsuarioModel usuario;
	
	@OneToMany(mappedBy = "orden")
	private ArrayList<DetalleModel> detalle;
	
//	////////////////////////////////////////////////
	public UsuarioModel getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioModel usuario) {
		this.usuario = usuario;
	}
//	//////////////////////////////////////////////////
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre_orden() {
		return nombre_orden;
	}
	public void setNombre_orden(String nombre_orden) {
		this.nombre_orden = nombre_orden;
	}
//	public Long getUsuario_id() {
//		return usuario_id;
//	}
//	public void setUsuario_id(Long usuario_id) {
//		this.usuario_id = usuario_id;
//	}
	
}
