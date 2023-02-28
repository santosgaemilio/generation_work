package control;

import java.util.Scanner;

public class EstructuraMultiple {
	Scanner dato = new Scanner(System.in);
	public void esVocal() {
		System.out.println("Introduzca una letra: ");
		char letra = dato.next().charAt(0);
		
		switch (Character.toLowerCase(letra)) {
//		Si los casos todos dan al mismo resultado se pueden poner de esta manera
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Es vocal");
			break;

		default:
			System.out.println("No es vocal");
			break;
		}
	}
	
	public void esVocalIf() {
		System.out.println("Introduzca una letra: ");
		char letra = Character.toLowerCase(dato.next().charAt(0));
		if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ) {
			System.out.println("Es una vocal");
		}else {
			System.out.println("No es una vocal");
		}
	}
	
	public void notas() {
		System.out.println("Introduzca una nota: ");
		byte nota = dato.nextByte();
		switch (nota) {
		case 10:
			System.out.println("Excelente te rifaste!!");
			break;
		case 9:
			System.out.println("Muy bien hecho campeón");
			break;
		case 8:
			System.out.println("Que bárbaro");
			break;
		case 7:
			System.out.println("Estuvo cerca!");
			break;
		case 6:
			System.out.println("Ponte pilas casi la riegas");
			break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			System.out.println("Reprobadísimo");
			break;

		default:
			System.out.println("Introduce una nota correcta");
			break;
		}
	}
	
	/*
	 * ?: Operador Elvis / Operados Ternario
	 * variable = (PL)? entrada verdad : entrada falso
	 * 
	 * */
	
	public void ternario() {
		System.out.println("Introduzca un número: ");	
		int num = dato.nextInt();
		System.out.println("Introduzca otro número");
		int num2 = dato.nextInt();
		
		int menor = (num <= num2)? num :num2;
		System.out.println(menor + " es menor");
	}
}
