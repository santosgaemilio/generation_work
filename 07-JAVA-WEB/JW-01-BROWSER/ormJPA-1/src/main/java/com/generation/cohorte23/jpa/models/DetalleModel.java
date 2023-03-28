package com.generation.cohorte23.jpa.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalle_orden")
public class DetalleModel {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
	private String nombre_detalle_orden;
//	private Long orden_id;
//	private Long producto_id;
	
	@ManyToOne
	private OrdenModel orden;
	@ManyToOne
	private ProductoModel producto;
	
//	///////////////////////////////////////////////////////	
	public OrdenModel getOrden() {
		return orden;
	}
	public void setOrden(OrdenModel orden) {
		this.orden = orden;
	}
	public ProductoModel getProducto() {
		return producto;
	}
	public void setProducto(ProductoModel producto) {
		this.producto = producto;
	}
//	////////////////////////////////////////////////////////
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
//	public Long getOrden_id() {
//		return orden_id;
//	}
//	public void setOrden_id(Long orden_id) {
//		this.orden_id = orden_id;
//	}
//	public Long getProducto_id() {
//		return producto_id;
//	}
//	public void setProducto_id(Long producto_id) {
//		this.producto_id = producto_id;
//	}
	public String getNombre_detalle_orden() {
		return nombre_detalle_orden;
	}
	public void setNombre_detalle_orden(String nombre_detalle_orden) {
		this.nombre_detalle_orden = nombre_detalle_orden;
	}
	
}
