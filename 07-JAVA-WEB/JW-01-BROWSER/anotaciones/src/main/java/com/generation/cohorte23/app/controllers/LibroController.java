package com.generation.cohorte23.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.cohorte23.app.model.Libro;
import com.generation.cohorte23.app.repositories.LibrosRepositorios;

@RestController //Checar por que tiene que ser rest
public class LibroController {
	@Autowired // Se hace una instancia con esta de autowired, es más sencillo
	LibrosRepositorios lr; //Vic cambio esto por librosRepo
	
	@RequestMapping("/libros")
	public List<Libro> listarTodo(){ 
//Como estoy en el controller para llamar una función solo la declaro con un return y lo hace
// es como si ya fuera de cajón que se va a activar la función listarTodo
		return lr.listar(); // Vic cambio este nombre por listarLibros()
	}
}
