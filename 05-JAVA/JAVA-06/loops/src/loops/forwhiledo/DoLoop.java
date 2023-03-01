package loops.forwhiledo;

import java.util.Scanner;



public class DoLoop {
	Scanner input = new Scanner(System.in);
	public void digitDo() {
		int value;
		int acumulador = 0;
		do {
			System.out.println("Introduzca un dígito entre (0,9): ");
			value = input.nextInt();
			acumulador = acumulador + value;
			System.out.println("-->" + acumulador);
		} while (value>=0 && value<=9);
		System.out.println("babye");
	}
}
