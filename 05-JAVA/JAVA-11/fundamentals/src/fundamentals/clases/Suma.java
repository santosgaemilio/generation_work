package fundamentals.clases;

public class Suma implements ArithmeticOP, Messages{
	private int a;
	private int b;
	
	public Suma(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	@Override
	public double sumar() {
		return a+b;
	}

	@Override
	public double restar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void mensaje() {
		System.out.println("Esta es una suma");
		
	}
	
}
