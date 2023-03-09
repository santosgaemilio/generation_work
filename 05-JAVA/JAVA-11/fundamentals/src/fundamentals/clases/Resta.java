package fundamentals.clases;

public class Resta implements ArithmeticOP, Messages{
	private int a;
	private int b;
	
	
	public Resta(int a, int b) {
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
	public void mensaje() {
		System.out.println("Esta es una resta");
		
	}

	@Override
	public double sumar() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double restar() {
		// TODO Auto-generated method stub
		return a-b;
	}

}
