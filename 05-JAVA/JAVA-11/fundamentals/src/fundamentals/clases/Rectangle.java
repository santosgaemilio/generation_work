package fundamentals.clases;

import java.util.Scanner;

public class Rectangle extends Geometric{
	private double base;
	private double height;
	@Override
	public double areas() {
		double area = this.base*this.height;
		return area;
	}
	public Rectangle(double base, double height) {
		super("Rectangle");
		this.base = base;
		this.height = height;
	}
	
	public Rectangle() {
		super("Rectangle");
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
	
	@Override
	public void data() {
		Scanner input = new Scanner(System.in);
		System.out.print("Base: ");
		setBase(input.nextDouble());
		System.out.print("Altura: ");
		setHeight(input.nextDouble());
		input.close();
	}

}
