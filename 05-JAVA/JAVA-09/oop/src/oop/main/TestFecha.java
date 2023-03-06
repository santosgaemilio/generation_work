package oop.main;



import oop.clases.Fecha;

public abstract class TestFecha {

	public static void main(String[] args) {
		Fecha dia = new Fecha(03, 06, 2023);
		System.out.println(dia.QueDiaEs());

		System.out.println(dia);
	}

}
