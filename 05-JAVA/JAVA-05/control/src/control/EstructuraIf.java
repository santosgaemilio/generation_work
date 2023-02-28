package control;

import java.util.Scanner;

public class EstructuraIf {
	Scanner entrada = new Scanner(System.in);
	public void controlIf() {
//		if (condition) {
//		
//		}
		
//		if (condition) {
//			
//		} else {
//
//		}
		
		long nota = 4;
		if (nota > 5) {
			System.out.println("Es una nota aprobada");
		}
		System.out.println("Continua el control...");
		
		if (nota >= 5) {
			System.out.println("Es una nota aprobada " + nota);
		} else {
			System.out.println("Nota no aprobada");
		}
		
	}
	
	public void divisible() {
		System.out.print("Ingresa el número: ");
		int num = entrada.nextInt();
		System.out.print("Ingresa el segundo número:");
		int num2 = entrada.nextInt();
		
		if (num%num2 == 0) {
			System.out.println(num + " es divisible entre " + num2);
		}else {
			System.out.println(num + " no es divisible entre " + num2);
		}
		
	}
	
	public void comparar() {
		System.out.print("Ingresa el número: ");
		int num = entrada.nextInt();
		System.out.print("Ingresa el segundo número:");
		int num1 = entrada.nextInt();
		
		if (num>num1) {
			System.out.println(num + " es mayor que "+num1);
			
		}else {
			System.out.println(num1 + " es mayor que "+num);
		}
		
	}
	
	public void anidado() {
//		if (condition) {
//			
//		} else if() {
//
//		}else {
//			
//		}
	}
	
	public void poser() {
		System.out.print("Ingresa el número: ");
		int num = entrada.nextInt();
		if (num == 0) {
			System.out.println("El número es 0");
		} else if(num > 0) {
			System.out.println("El número es positivo");
		}else {
			System.out.println("El número es negativo");
		}
	}
}
