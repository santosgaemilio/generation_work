package fundamentals.main;

import fundamentals.clases.ArithmeticOP;
import fundamentals.clases.Messages;
import fundamentals.clases.Resta;
import fundamentals.clases.Suma;

public class Interface {

	public static void main(String[] args) {
		Suma sum = new Suma(123, 234);
		System.out.println(sum.sumar());
		sum.mensaje();
		
		Resta res = new Resta(123, 234);
		System.out.println(res.restar());
		res.mensaje();

	}

}
