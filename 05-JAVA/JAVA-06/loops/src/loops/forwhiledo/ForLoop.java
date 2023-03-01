package loops.forwhiledo;

public class ForLoop {
	public void ForLoopy() {
		for (int i = 0; i < 10; i++) {
			System.out.println("El iterador --> " + i);
		}

	}
	
	public void ForLetters() {
//		Se pueden usar caracteres como valores, en este caso es de 65 a 90
//		Pero solamente lo puedes declarar con las single quotes, con double no agarra, es siempore String
		for (int i = 'A'; i < 'Z'; i++) {
			System.out.println("Caracter --> "+(char)i);
		}

	}
}
