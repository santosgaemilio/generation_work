package oop.main;


import oop.clases.Persona;

public class TestPersona {

	public static void main(String[] args) {
		Persona persona = new Persona();
		System.out.println(persona.nombre);
		persona.setNombre("Emilio");
		System.out.println(persona.getNombre());
		
		Persona persona2 = new Persona("Emilio", 26, 1.78d, 100d,"Sagitario");
		System.out.println(persona2.datosPersona());
		
		
		
	}

}

// DIA MES AÑO