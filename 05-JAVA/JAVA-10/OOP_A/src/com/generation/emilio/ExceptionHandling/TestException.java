package com.generation.emilio.ExceptionHandling;

public class TestException {

	public static void main(String[] args) {
		
		try {
			Division d = new Division(4, 0);
			d.visualizarD();
		} catch (OpExceptions e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		//System.out.println("continua");

	}

}
