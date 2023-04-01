package com.generation.ecommerce.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.ecommerce.model.Producto;
import com.generation.ecommerce.services.ProductoService;

// Todo esto te deja conectar todos los servidores que tienes, el del live server de js
// el de la base de datos y el de spring y el de postman. No es recomentdable en irl

@CrossOrigin(origins = "*", 
methods = { RequestMethod.GET, RequestMethod.POST, 
		RequestMethod.DELETE, RequestMethod.PUT })

@RestController //Controller que soporta métodos HTTP
@RequestMapping(path = "/miOtzo/productos/") //URL de nuestro endpoint donde se van a hacer
// las solicitudes
public class ProductoController {
	
//	Instancia de la clase "Producto Servicio"
//  Declara la instancia de la Clase ProductoService que se 
//	utiliza para acceder a los metodos definidos ahi.Se declara como 
//	final porque su valor no sera cambiado despues de inicializar, para 
//	que esta instancia no cambie durante la ejecucion del programa
	
	private final ProductoService productoServicio;
	
	@Autowired  //Se usa para indicar a Spring que inyecte automaticamente 
	//una instancia del ProductoService en la clase ProductoController. Asi 
	//nos aseguramos que la instancia esta disponible y lista para usarse 
	//cuando se necesite en la clase.
	
	//Constructor con ese objeto como parametro
	public ProductoController(ProductoService productoServicio) {
		this.productoServicio = productoServicio;
	}
	
//	HTTP GET
	@GetMapping
	public List<Producto> getProducto() {
		return productoServicio.leerProductos();
	}
	@GetMapping(path = "{prodId}") 
	private Producto getProducto(Long prodId) {
		return productoServicio.leerProducto(prodId);
	}
	
//	HTTP POST
	@PostMapping
	public void postProducto(@RequestBody Producto producto) { //Agrega un cuerpo a el prod
		productoServicio.crearProducto(producto); 
		//disparo la operación de crud para modificar la BD
	}
	
//	HTTP PUT
	@PutMapping(path = "{prodId}") 
	public void putProducto(@PathVariable("prodId") Long prodId,
			@RequestParam(required = false)String nombre,
			@RequestParam(required = false)String descripcion,
			@RequestParam(required = false)Double precio,
			@RequestParam(required = false)String URL_Imagen) {
		productoServicio.actualizarProducto(prodId,nombre,descripcion,URL_Imagen,precio);
	}
	
//	HTTP DELETE
	@DeleteMapping(path = "{prodId}") //Borraré elementos por ID (miOtzo/productos/pordId)
	public void deleteProducto(@PathVariable("prodId") Long prodId) {
		productoServicio.borrarProducto(prodId);
	}
}
