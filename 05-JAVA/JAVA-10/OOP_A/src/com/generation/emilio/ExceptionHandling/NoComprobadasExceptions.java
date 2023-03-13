package com.generation.emilio.ExceptionHandling;

import java.util.Scanner;

public class NoComprobadasExceptions {
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		System.out.println("Ingrese un valor");
		
		try {
			int div = Integer.parseInt(dato.next());
			int divi = 10/div;
			System.out.println(divi);
		} catch (ArithmeticException e) {
			System.out.println("Dividiste entre 0 mi rey");
			System.out.println(e.getMessage());
		}catch (NumberFormatException n) {
			System.out.println("Ponme un número mi rey");
			System.out.println(n.getMessage());
		}finally {
			System.out.println("sea como sea eres un crack rey");
		}
		
		
		
	}
}
