package com.generation.emilio.main;

import java.util.*;

public class Collections {

	public static void main(String[] args) {
			List collection = new ArrayList();
			// List es interfaz y ArrayList() es la clase abstracta
			collection.add("colecciones");
			collection.add(23);
			collection.add(23.23);
			collection.add('a');
			// Aqui convierte los argumentos a objetos ??, creo que por eso se 
			// puede tener cualquier tipo en collection
			// se generan las versione wrapper de los primitivos
			for (Object elem : collection) {
				System.out.println(elem);
			}
			
//			Lista parametrizada!!! Solo te va a aceptar Integers
			List<Character> collection2 = new ArrayList<Character>();
			collection2.add('a');
			collection2.add('b');
	}

}
