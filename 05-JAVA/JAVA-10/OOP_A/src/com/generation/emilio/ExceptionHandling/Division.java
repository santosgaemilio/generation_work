package com.generation.emilio.ExceptionHandling;

public class Division {
	private int den;
	private int num;
	
//	Constructor 
	public Division(int num, int den) throws OpExceptions {
		if(den == 0) {
			throw new OpExceptions("El denominador es 0");
		}
		this.den = den;
		this.num = num;
	}
	
	public void visualizarD() {
		System.out.println("El resultado de la división es: "+(this.num/this.den));
	}
	
}
