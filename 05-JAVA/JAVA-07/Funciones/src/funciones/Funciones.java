package funciones;

import java.util.Scanner;

public class Funciones {
	
	public static int sumar(int num1, int num2) {
//		Se pone el tipo de dato cuando aceptas argumentos
		int resultado = num1 + num2;
		return resultado;
	}
	public static int resta(int num1, int num2) {
		int resultado = num1 - num2;
		return resultado;
	}
	public static int mult(int num1, int num2) {
		int resultado = num1 * num2;
		return resultado;
	}
	public static double div(double num1, double num2) {
		double resultado = num1 / num2;
		return resultado;
	}
	public static void printAsterisc() {
		System.out.println("****************************************");

	}
	
//	FUNCIÓN CON DIFERENTES TIPOS DE PARÁMETROS
	public static float sumaDecimal(float valor1, int valor2) {
		return valor1 + valor2;
	}
	
//	FUNCIÓN QUE TIENE STRINGS COMO ARGUMENTOS
	public static String awitaDeLimon(String ingrediente1, String ingrediente2) {
		String recetaCompletadaString = ingrediente1 +" "+ ingrediente2;
		return recetaCompletadaString;
	}
	
	public static double torreHeight(double base, double angle) {
		double result = Math.tan(Math.toRadians(angle))*base;
		return result;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		printAsterisc();
//		System.out.println(sumar(4, 4));
//		System.out.println(resta(4, 5));
//		System.out.println(mult(3, 4));
//		System.out.println(div(1, 3));
//		printAsterisc();
//		printAsterisc();
//		System.out.println(sumaDecimal(3.234f, 23));
////		No puedes poner primero el flotante que el int, es muy obvio. Ya sabías que el
////		orden de los argumentos se respeta
//		printAsterisc();
//		System.out.println(awitaDeLimon("agua", "limones"));
//		
//		double valorEjemplo = 7.65823479d;
		System.out.print("Introduce la base en metros: ");
		double base = input.nextDouble();
		System.out.print("Introduce el ángulo de vista en grados: ");
		double angle = input.nextDouble();
		System.out.println("Tu base es de: "+base + "m, y tu altura es de: "+torreHeight(base,angle)+"m");
//		System.out.println("La raiz cuadrada de mi valor es: "+ Math.sqrt(valorEjemplo));
	}

}


/*
 * 
 Funciones

	- No retornan valores: No devuelven nada, no se especifica nada, y no se usa "return"
	- Si retornan valores: Se especifica el tipo de dato, el tipo de valor que regresa y
	 se usa return
	 
	Las funciones se pueden declarar en cualquier lugar de la clase, pero las invocaciones se
	hacen generalmente dentro del método main
	
	FELIPE RECOMIENDA QUE PONGA UN COMMENT AL FINAL DE LAS LLAVES PARA VER QUE CIERRA
*/
