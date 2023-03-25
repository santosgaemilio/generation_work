package com.generation.cohorte23.jpa.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.generation.cohorte23.jpa.models.UsuarioModel;
import com.generation.cohorte23.jpa.services.UsuarioServices;

@RestController
// Lo mapeas a el endpoint usuario
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioServices usuarioService;
	
	//DELETE
	
	@DeleteMapping(path = "/{id}")
	public String eliminarPorId(@PathVariable("id") Long id) {
		if (usuarioService.eliminarUsuario(id)) {
			return "Se eliminó el usuario";
		}else {
			return "No se encuentra el usuario";
		}
		
	}
	
	// GET LEE DATOS
	@GetMapping()
	public ArrayList<UsuarioModel> listarUsuarios(){
		return usuarioService.listarUsuarios();
	}
	
	// POST CREA DATOS
	@PostMapping()
	public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario) {
		return usuarioService.guardarUsuario(usuario);
	}
	
	@GetMapping("/query")
	// Creo que el request param agarra un parámetro de la tabla y eso es lo que lee
	// por eso lo puso como param
	public ArrayList<UsuarioModel> obtenerPorPrioridad (@RequestParam("prioridad") Integer prioridad){
		return usuarioService.busquedaPorPrioridad(prioridad);
	}
	
	@GetMapping(path = "/{id}")
	public Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") Long id){
		return usuarioService.obtenerPorId(id);
	}
}
