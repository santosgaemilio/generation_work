package oop.clases;

public class Persona {
	public String nombre = "Juan";
	private int edad;
	private double altura;
	private double peso;
	private String zodiaco;
	
	
//	CONSTRUCTOR
	public Persona(String nombre, int edad, double altura, double peso, String zodiaco) {
			super();
			this.nombre = nombre;
			this.edad = edad;
			this.altura = altura;
			this.peso = peso;
			this.zodiaco = zodiaco;
	}
	
	
//	CONSTRUCTOR SOBRECARGADO, ES PARA CREAR UN OBJETO SIN PARÁMETROS
	public Persona() {
		super();
	}

	

//  SOLO NECESITA EL NOMBRE
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public String datosPersona() {
		return this.nombre + " " + this.edad + " " + this.altura + " " + this.zodiaco + 
				" " + this.peso;
	}


//	GETTERS AND SETTERS
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getZodiaco() {
		return zodiaco;
	}
	public void setZodiaco(String zodiaco) {
		this.zodiaco = zodiaco;
	}
	
//	Se le pone private por que solo objetos creados de esta clase pueden tomar estos datos
//	Método constructor y métodos accesores
//	Los métodos accesores son los get() y set() con esto cambias y obtienes los atributos de los objetos
	
	
	
}
