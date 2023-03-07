package com.generation.emilio.clases;

public class PerimeterArea {
	public double areaSq(double lado) {
		double area = Math.pow(lado, 2);
		return area;		
	}
	
	public double perimeterSq(double lado) {
		double perimeter = lado*4;
		return perimeter;
	}
	
	public double areaTri(double base, double height) {
		return (base*height)/2;
	}
	
	public double perimeterTri(double ladoA, double ladoB, double ladoC) {
		return ladoA + ladoB + ladoC;
		
	}
	
	public double areaCir(double radious) {
		return Math.PI*Math.pow(radious, 2); 
	}
	
	public double perimeterCir(double radious) {
		return Math.PI*2*radious;
		
	}
}
