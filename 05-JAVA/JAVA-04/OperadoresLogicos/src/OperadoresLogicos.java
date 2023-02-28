import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int edad = 19;
		boolean tieneLicencia = true;
		if (edad >= 18 && tieneLicencia) {
		    System.out.println("Puede conducir un coche");
		} else {
		    System.out.println("No puede conducir un coche");
		}
		
		String nombre = "Pedro";
		String apellido = "Pérez";
		if (nombre.equals("Juan") || apellido.equals("Pérez")) {
		    System.out.println("El usuario es Juan Pérez");
		} else {
		    System.out.println("El usuario no es Juan Pérez");
		}
		
		boolean esVerdadero = true;
		if (!esVerdadero) {
		    System.out.println("La condición es falsa");
		} else {
		    System.out.println("La condición es verdadera");
		}
		
		//Ej 1
		Scanner scn = new Scanner(System.in);
		System.out.println("Introduce el número: ");
		int num = scn.nextInt();
		System.out.println(num>=0 && num%2 ==0);
		String cadena1 = "Hola";
		String cadena2 = "hola";
		System.out.println(cadena1.equals(cadena2));
		
		
		

	}

}
