package com.generation.emilio.clases;

public class ClaseGenerica<T>{
	T obj;
	public ClaseGenerica(T obj) {
		this.obj = obj;
	}
	public void claseTipo() {
		System.out.println("El tipo T es: "+obj.getClass().getName());
	}
}
