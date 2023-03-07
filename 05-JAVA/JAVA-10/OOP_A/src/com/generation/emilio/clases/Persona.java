package com.generation.emilio.clases;

public class Persona {
	String name;
	int age;
	int nss;
	public Persona(String name, int age, int nss) {
		super();
		this.name = name;
		this.age = age;
		this.nss = nss;
	}
	public Persona() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNss() {
		return nss;
	}
	public void setNss(int nss) {
		this.nss = nss;
	}
	
	
	
}
