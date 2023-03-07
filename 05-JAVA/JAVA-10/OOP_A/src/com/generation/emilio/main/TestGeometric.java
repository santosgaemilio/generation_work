package com.generation.emilio.main;

import com.generation.emilio.clases.Geometric;
import com.generation.emilio.clases.PerimeterArea;

public class TestGeometric {

	public static void main(String[] args) {
		PerimeterArea pa = new PerimeterArea();
		double areaSq = pa.areaSq(5);
		System.out.println("----> "+ areaSq);
		
		Geometric  square = new Geometric();
		square.setArea(areaSq);
		System.out.println("Area del cuadrado " + square.getArea());
		square.setPerimeter(pa.perimeterSq(5));
		System.out.println("Perímetro del cuadrado "+square.getPerimeter());
		System.out.println("");
		Geometric triangle = new Geometric();
		triangle.setArea(pa.areaTri(5, 4.330127018922));
		System.out.println("Área del triángulo " + triangle.getArea());
		triangle.setPerimeter(pa.perimeterTri(5, 5, 5));
		System.out.println("Perímetro del triángulo "+ triangle.getPerimeter());
		System.out.println("");
		Geometric circle = new Geometric();
		circle.setArea(pa.areaCir(3));
		System.out.println("Área del círculo "+ circle.getArea());
		circle.setPerimeter(pa.perimeterCir(3));
		System.out.println("Perímetro del círculo "+ circle.getPerimeter());
	}

}
