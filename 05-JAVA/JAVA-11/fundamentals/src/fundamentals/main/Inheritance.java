package fundamentals.main;

import fundamentals.clases.Alumno;

public class Inheritance {

	public static void main(String[] args) {
		Alumno a  = new Alumno("134512", 93.2, "Roberto Santos", 21);
		System.out.println(a.getNombre());
		System.out.println(a.toString());
		a.mostrarDatos();
//		El polimorfismo dinámico es cuando haces el override y el 
//		estático es cuando literal tienes dos métodos con el mismo nombre
//		pero con dif parámetros y dif procesos o iguales
	}

}
