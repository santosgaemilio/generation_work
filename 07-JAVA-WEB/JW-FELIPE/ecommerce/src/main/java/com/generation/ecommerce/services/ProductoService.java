package com.generation.ecommerce.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.ecommerce.model.Producto;
import com.generation.ecommerce.repositories.ProductoRepository;

@Service
public class ProductoService {
//	Declara la instancia de la Clase ProductoRepository
	private final ProductoRepository productoRepository;
	
//	cableo
	@Autowired
	
	public ProductoService(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}
	
	
//	CREATE 
	public void crearProducto(Producto producto) {
		Optional <Producto> prodByName = 
				productoRepository.findByNombre(producto.getNombre());
		if (prodByName.isPresent()) {
			throw new IllegalStateException("El producto con el nombre "
	                  + "[" + producto.getNombre() + "] ya existe.");
//			producto.aumentar();
		}else {
			productoRepository.save(producto);
		}
//		Esta variable temporal llamada prpdByName
	}

//	READ
	public List<Producto> leerProductos() {
		return productoRepository.findAll();
	}
	
	public Producto leerProducto(Long id) {
		return productoRepository.findById(id).orElseThrow(()-> new IllegalStateException("El producto"
				+ "con el id" +id+  " no existe"));
	}
//	UPDATE
	public void actualizarProducto(Long prodId,String nombre, String descripcion, String URL_Imagen, Double precio) {
		if(productoRepository.existsById(prodId)) {
//			Esta onda es una función vieja que talvez no se debería de usar
			Producto productoABuscar = productoRepository.getById(prodId);
			if(nombre!= null) productoABuscar.setNombre(nombre);
			if (descripcion!= null) productoABuscar.setDescripcion(descripcion);
	        if (precio != null) productoABuscar.setPrecio(precio);
	        if (URL_Imagen!= null) productoABuscar.setURL_Imagen(URL_Imagen);
	        productoRepository.save(productoABuscar);
		}else {
			System.out.println("El producto con el id "+prodId+" no existe");
		}
	}
//	DELETE
	public void borrarProducto(Long id) {
		if(productoRepository.existsById(id)) {
			productoRepository.deleteById(id);
		}else {
			System.out.println("El producto con el id "+id+" no existe");
		}
	}
}
