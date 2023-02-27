package Principal;

import java.util.Scanner;

import clases.NuevoHola;

public class EjecutarNH {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		// Scanner es una clase que permite inputs, como el prompt de JS
		
//		NuevoHola nh = new NuevoHola("Emilio");
//		nh.saludo();
		
		String name; 
		System.out.println("Cual es tu nombre? ");
		name = sn.next();
		
		NuevoHola nh_2 = new NuevoHola();
		nh_2.pedirNameSaludo(name);
	}
}

