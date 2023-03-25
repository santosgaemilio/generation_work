package com.generation.cohorte23.ioc.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // Lo declaramos como controller por que este es el que va a decidir que hacer
public class HolaMundo {
	
	@RequestMapping("/") //Es un endpoint, te dice donde se va a depositar, en este caso es la raiz
	// El request le dice al servidor que le va enviar la siguiente función
	// El por que si imprime un return pues nunca sabré, pero está padre
	public static String hola() {
		return "Hola mundo";
	}
}
