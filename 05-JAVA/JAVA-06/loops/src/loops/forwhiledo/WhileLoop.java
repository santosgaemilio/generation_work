package loops.forwhiledo;

import java.util.Scanner;



public class WhileLoop {
	Scanner input = new Scanner(System.in);
//	Ciclo while clásico
	public void cicloW() {
		int iterador = 1;
		while (iterador <= 10) {
			System.out.println(iterador);
			iterador ++;
			
		}
		
	}
	
//	Ejemplo del uso sentinela del ciclo While
	public void centinelaW() {
//		La palabra "final" hace que la variable sea una constante
		final int centinela = 1;
		System.out.print("Introduzca su calificación: ");
		int nota = input.nextInt();
		while (nota != centinela) {
			System.out.println("La nota es: " + nota);
			System.out.print("Introduzca su calificación: ");
			nota = input.nextInt();
		}
		System.out.println("C'est fini");
	}
	
	public void flagW() {
		boolean valorb = false;
		while(!valorb) {
			System.out.print("Introduzca un valor: ");
			int valor = input.nextInt();
			if (valor > 0 && valor<=5) {
				int power = (int) Math.pow(valor, 2);
				System.out.println("El cuadrado del valor es: "+power);
			} else {
				System.out.println("bye");
				valorb = true;
			}
		}
	
	}
}
