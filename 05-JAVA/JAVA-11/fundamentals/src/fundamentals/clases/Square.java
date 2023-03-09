package fundamentals.clases;

public class Square extends Geometric{
	double side;

	@Override
	public double areas() {
		double area = Math.pow(side, 2);
		return area;
	}

	public Square(double side) {
		super("Square");
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		
	}
	
}
