package main;

public class Comparacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumar(9,9);
	}
	public static void sumar(int a, int b){
		if(a+b > 10){
			System.out.println("Rango superior");
		}else{
			System.out.println("Rango inferior");
		}
	}
}
