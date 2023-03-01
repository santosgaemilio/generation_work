package loops.control;

import java.util.Scanner;

import loops.forwhiledo.DoLoop;
import loops.forwhiledo.ForLoop;
import loops.forwhiledo.WhileLoop;

public class DoSwitch {
	public void controlador() {
		WhileLoop wl = new WhileLoop();
		ForLoop fl = new ForLoop();
		DoLoop dl = new DoLoop();
		Menus mp = new Menus();
		Scanner input = new Scanner(System.in);
		int op;
		do {
			mp.menuPrincipal();
			System.out.print("Introduzca una opción: ");
			op = input.nextInt();
			switch (op) {
			case 1:
				wl.cicloW();
				break;
			case 2:
				wl.centinelaW();
				break;
			case 3:
				wl.flagW();
				break;
			case 4:
				fl.ForLoopy();
				break;
			case 5:
				fl.ForLetters();
				break;
			case 6:
				dl.digitDo();
				break;
			default:
				System.out.println("Gracias por participar!");
				break;
			}
		} while (op>=1 && op<7);

	}
}
