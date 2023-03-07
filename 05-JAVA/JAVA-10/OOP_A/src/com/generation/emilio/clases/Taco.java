package com.generation.emilio.clases;

public class Taco {
	String tipoDeTortilla;
	String guisado;
	int numeroDeTortilla;
	String tamanioDeTortilla;
	float precio;
	
	// INICIALIZACIÓN -------------------------------------------------------------------
	public Taco(String tipoDeTortilla, String guisado, int numeroDeTortilla, String tamanioDeTortilla, float precio) {
		super();
		this.tipoDeTortilla = tipoDeTortilla;
		this.guisado = guisado;
		this.numeroDeTortilla = numeroDeTortilla;
		this.tamanioDeTortilla = tamanioDeTortilla;
		this.precio = precio;
	}
	
	public Taco() {
		super();
	}

	public String getTipoDeTortilla() {
		return tipoDeTortilla;
	}
	public void setTipoDeTortilla(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}
	public String getGuisado() {
		return guisado;
	}
	public void setGuisado(String guisado) {
		this.guisado = guisado;
	}
	public int getNumeroDeTortilla() {
		return numeroDeTortilla;
	}
	public void setNumeroDeTortilla(int numeroDeTortilla) {
		this.numeroDeTortilla = numeroDeTortilla;
	}
	public String getTamanioDeTortilla() {
		return tamanioDeTortilla;
	}
	public void setTamanioDeTortilla(String tamanioDeTortilla) {
		this.tamanioDeTortilla = tamanioDeTortilla;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	// ------------------------------------------------------------------------------
	
	public void preparar() {
		System.out.println("Tu taco es de "+this.guisado + " con "+
	this.numeroDeTortilla+" tortilla de "+this.tipoDeTortilla
				+ " tamaño " +this.tamanioDeTortilla);
	}
	public void vender(int noTaco) {
		double total = this.precio * noTaco;
		System.out.println("Por tus "+noTaco+" tacos van a ser "+ total + " pesos");
	}
	
	public void ponerSalsa(String salsa) {
		System.out.println("Le pusiste salsa tipo "+salsa);
	}
	
	public void subirPrecio(int aumento) {
		setPrecio(this.precio + aumento);
		System.out.println("El nuevo precio es de " + this.precio+ " pesos por taco"); 
	}
	@Override
	public String toString() {
		return "En efecto es un taco";
		//return "Taco [tipoDeTortilla=" + tipoDeTortilla + ", guisado=" + guisado + ", numeroDeTortilla="
				//+ numeroDeTortilla + ", tamanioDeTortilla=" + tamanioDeTortilla + ", precio=" + precio + "]";
	}
	
	
	
}
