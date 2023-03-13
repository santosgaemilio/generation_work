package unittestingJUnit.app;

public class Calculadora {
	public int sumar(int a, int b) {
		return a + b;
	}
	public int restar(int a, int b) {
		return a - b;
	}
	
	public double dividir(double a, double b) {
		if(b == 0) { 
			throw new ArithmeticException("Era cero");
		}
		return a/b;
	}
}
