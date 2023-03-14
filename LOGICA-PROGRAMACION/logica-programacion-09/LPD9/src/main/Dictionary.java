package main;

import java.util.HashMap;
import java.util.Scanner;

public class Dictionary {

	public static void main(String[] args) {
		HashMap<String, String> dict = new HashMap<String, String>();
		dict.put("gato", "cat");
		dict.put("perro", "dog");
		dict.put("casa", "house");
		dict.put("hombre", "man");
		dict.put("mujer", "woman");
		dict.put("vaso", "vase");
		dict.put("flor", "flower");
		dict.put("mono", "monkey");
		dict.put("elefante", "elefant");
		dict.put("carro", "car");
		dict.put("color", "color");
		dict.put("hamburguesa", "hamburger");
		dict.put("camioneta", "truck");
		dict.put("teclado", "keyboard");
		dict.put("computadora", "computer");
		dict.put("desarrollador", "developer");
		dict.put("sol", "sun");
		dict.put("luna", "moon");
		dict.put("tierra", "earth");
		dict.put("llave", "key");
		search(dict);
	}
	public static void search(HashMap m) {
		Scanner input = new Scanner(System.in);
		System.out.print("Introduzca la palabra a traducir: ");
		String p = input.nextLine();
		if (m.get(p) == null) {
			System.out.println("La palabra no se encuentra en el diccionario");
		}else {
			System.out.println(m.get(p));
		}
	}

}
