package com.generation.emilio.main;

import com.generation.emilio.clases.Taco;

public class TestTaco {

	public static void main(String[] args) {
		Taco taco1 = new Taco("Maiz", "Chicharrón", 2, "chica", 18);
		taco1.preparar();
		taco1.vender(3);
		taco1.ponerSalsa("roja");
		taco1.subirPrecio(1);
		System.out.println(taco1);
		System.out.println("--------------------------------------");
		Taco taco2 = new Taco("Maiz", "Barbacoa", 1, "grande", 20);
		taco2.preparar();
		taco2.vender(4);
		taco2.ponerSalsa("verde");
		taco2.subirPrecio(3);
		
		System.out.println(taco2);
	}

}
