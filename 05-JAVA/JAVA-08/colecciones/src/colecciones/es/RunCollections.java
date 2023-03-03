package colecciones.es;

import java.util.*;

public class RunCollections {

	public static void main(String[] args) {
//		Vic creó un objeto para implementar el método por que su método de lista no es estático.
//		wrapperClass();
//		print(listCollection());
		print(mapCollection());
//		mapCollection();
//		Yo no tengo que agregar el objeto por que mi lista es estática
	}
	
	static Set setCollections() {
		Set mySet = new HashSet();
		mySet.add("uno");
		mySet.add("dos");
		mySet.add("tres");
		mySet.add("cuatro");
		
		mySet.add("cinco");
		
		
		
//		Checar que hace constrain, clear y
		System.out.println(mySet);
		mySet.remove("cinco");
		System.out.println(mySet);
		System.out.println("Tamaño: " + mySet.size());
		System.out.println("Contiene la palabra 'cinco'?");
		System.out.println(mySet.contains("cinco"));
		
		
		mySet.clear();
		System.out.println("está vacía después de clear()? "+mySet.isEmpty());

		mySet.add(1);
		mySet.add(2);
		mySet.add(3);
		mySet.add(4);
		mySet.add(5);
		mySet.add(6);
		
		
		
		Object[] array = mySet.toArray();
		
		for (Object element : array) {
			System.out.println(element);
			
		}
		
		System.out.println("-----------------------------------------");
		System.out.println(array.getClass().getName());
		System.out.println("-----------------------------------------");
		
		
		return mySet;
	}
	
	private static Collection mapCollection() {
		Map map = new HashMap();
		map.put("valor1", "Juan");
		map.put("valor2", "María");
		map.put("valor3", "Emilio");
		map.put("valor4", "Pedro");
		
//		miMap.clear();  Hace lo mismo que en todos los demás
//		miMap.remove("valor3"); Borra tanto key and value
//		print(map.values());
		
		return map.values();
		
		
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
	
	private static List listCollection() {
//		Le puse integer por que me lo pedía, pero las listas pueden tener datos de siempre
		List myList = new ArrayList();
		System.out.println(myList + " Tamaño de la lista: " + myList.size() + " BEFORE");
		System.out.println("está vacía "+myList.isEmpty());
//		Se genera una lista de la clase que lo implementa, la lista es de tipo lista, con la clase que implementa
//		que es ArrayList
		myList.add("1");
		myList.add(2);
		myList.add(3);
		myList.add(0,"Pato");
		
		myList.set(0,"replaced");
		myList.remove(0);
		
		System.out.println("------->" + myList.contains(2));
		System.out.println(myList + " Tamaño de la lista: " + myList.size() + " AFTER");
		System.out.println("está vacía "+myList.isEmpty());
		return myList;
	}
	
	private static void print(Collection collection) {
//		Se pone como argumento que va a necesitar una colección, no inicializa nada pero
		for (Object elementosObject : collection) {
			System.out.println("Elementos "+ elementosObject);
		}
	}
	
	

}
