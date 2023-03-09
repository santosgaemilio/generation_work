package fundamentals.clases;

public class Triangle extends Geometric{
	
	private double base;
	private double height;
	@Override
	public double areas() {
		double area = (this.base*this.height)/2;
		return area;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public Triangle(double base, double height) {
		super("Triangle");
		this.base = base;
		this.height = height;
	}
	@Override
	public void data() {
		// TODO Auto-generated method stub
		
	}
}
