package fundamentals.main;

import fundamentals.clases.Circle;
import fundamentals.clases.Geometric;
import fundamentals.clases.Rectangle;
import fundamentals.clases.Square;
import fundamentals.clases.Triangle;

public class Abstract {

	public static void main(String[] args) {
		Geometric rectangle = new Rectangle();
		rectangle.data();
		System.out.println(rectangle);
//		Geometric circle = new Circle(1);
//		Geometric triangle = new Triangle(2, 2);
//		Geometric square = new Square(9);
//		No puedes hacer una instancia de la clase abstracta
//		solamente se puede crear de una de la clase hija, como los ejemplos
//		de arriba ^
//		System.out.println("El área del "+rectangle.getName()+" es: "+rectangle.areas()+"m^2");
//		System.out.println("El área del círculo es: "+circle.areas()+"m^2");
//		System.out.println("El área del triángulo es: "+triangle.areas()+"m^2");
//		System.out.println("El área del cuadrado es: "+square.areas()+"m^2");
//		System.out.println(rectangle);

	}

}
