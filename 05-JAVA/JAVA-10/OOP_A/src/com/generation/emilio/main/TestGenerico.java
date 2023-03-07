package com.generation.emilio.main;

import com.generation.emilio.clases.ClaseGenerica;

public class TestGenerico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaseGenerica<Integer> intObj = new ClaseGenerica<Integer>(12);
		ClaseGenerica<String> stringObj = new ClaseGenerica<String>("Pedro");
		
		intObj.claseTipo();
		stringObj.claseTipo();
	}

}
