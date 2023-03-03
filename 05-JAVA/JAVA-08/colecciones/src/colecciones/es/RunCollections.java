package colecciones.es;

import java.util.*;

public class RunCollections {

	public static void main(String[] args) {
		wrapperClass();
		listCollection();
	}
	
	
	private static void wrapperClass() {
//	byte, short, char, long, float, int, double
//	Todos estos tienen una función wrapper que los convierte en clases
		byte numB = 127;
		System.out.println("Tamaño de un byte: "+Byte.SIZE + " bits");
		System.out.println("Valor Max "+Byte.MAX_VALUE);
		System.out.println("Valor Min "+Byte.MIN_VALUE);
		System.out.println("---> "+numB);
		
		System.out.println("-----------------------------------");
		
		System.out.println("Tamaño de un entero: "+Integer.BYTES + " bytes");
		System.out.println("Tamaño de un entero: "+Integer.SIZE + " bits");
		System.out.println("Valor Max "+Integer.MAX_VALUE);
		System.out.println("Valor Min "+Integer.MIN_VALUE);
		System.out.println("-----------------------------------");
		
		System.out.println("Tamaño de un short: "+Short.BYTES + " bytes");
		System.out.println("Tamaño de un short: "+Short.SIZE + " bits");
		System.out.println("Valor Max "+Short.MAX_VALUE);
		System.out.println("Valor Min "+Short.MIN_VALUE);
		System.out.println("-----------------------------------");
		
		System.out.println("Tamaño de un Long: "+Long.BYTES + " bytes");
		System.out.println("Tamaño de un Long: "+Long.SIZE + " bits");
		System.out.println("Valor Max "+Long.MAX_VALUE);
		System.out.println("Valor Min "+Long.MIN_VALUE);
		System.out.println("-----------------------------------");
		
	
		
		System.out.println("Tamaño de un Float: "+Float.BYTES + " bytes");
		System.out.println("Tamaño de un Float: "+Float.SIZE + " bits");
		System.out.println("Valor Max "+Float.MAX_VALUE);
		System.out.println("Valor Min "+Float.MIN_VALUE);
		System.out.println("-----------------------------------");
		
		System.out.println("Tamaño de un Double: "+Double.BYTES + " bytes");
		System.out.println("Tamaño de un Double: "+Double.SIZE + " bits");
		System.out.println("Valor Max "+Double.MAX_VALUE);
		System.out.println("Valor Min "+Double.MIN_VALUE);
		System.out.println("-----------------------------------");

	}
	
	private static void listCollection() {
		
		List myList = new ArrayList();
		myList.add(1);
		myList.add(2);
		myList.add(3);
	}
	
	

}
