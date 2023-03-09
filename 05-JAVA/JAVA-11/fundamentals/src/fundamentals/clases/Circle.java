package fundamentals.clases;

public class Circle extends Geometric{
	private double radious;
	@Override
	public double areas() {
		double area = Math.PI*Math.pow(radious, 2);
		return area;
	}
	public Circle(double radious) {
		super("Circle");
		this.radious = radious;
	}
	public double getRadious() {
		return radious;
	}
	public void setRadious(double radious) {
		this.radious = radious;
	}
	@Override
	public void data() {
		// TODO Auto-generated method stub
		
	}
	

}
