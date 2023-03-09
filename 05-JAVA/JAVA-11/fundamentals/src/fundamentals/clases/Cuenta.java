package fundamentals.clases;

import java.util.Scanner;

public class Cuenta {
	protected int noRe = 0;
	protected float taza;
	protected float com = 0;
	protected float saldo;
	protected int noCon = 0;
	
	public int getNoCon() {
		return noCon;
	}


	public void setNoCon(int noCon) {
		this.noCon = noCon;
	}


	public int getNoRe() {
		return noRe;
	}


	public void setNoRe(int noRe) {
		this.noRe = noRe;
	}


	public float getCom() {
		return com;
	}


	public void setCom(float com) {
		this.com = com;
	}


	
	
	public Cuenta(float saldo, float taza) {
		super();
		this.saldo = saldo;
		this.taza = taza;
	}
	

	public float getSaldo() {
		return saldo;
	}


	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}


	public float getTaza() {
		return taza;
	}


	public void setTaza(float taza) {
		this.taza = taza;
	}


	public void consignar() {
		Scanner input = new Scanner(System.in);
		System.out.print("Ingrese cantidad a consignar");
		float dinero = input.nextFloat();
		input.close();
		setSaldo(dinero+getSaldo());
		this.noCon++;
	}
	
	public void retirar() {
		Scanner input = new Scanner(System.in);
		System.out.print("Ingrese cantidad a retirar");
		float dinero = input.nextFloat();
		input.close();
		setSaldo(getSaldo()-dinero);
		this.noRe++;
		
	}
	public void calcularInteres() {
		float tazaMensual = getTaza()/12; 
		setSaldo(tazaMensual*getSaldo() + getSaldo());
		System.out.println("Saldo: " + getSaldo());
	}
	
	public void extractoMensual() {
		
	}


	@Override
	public String toString() {
		return "Cuenta [saldo=" + saldo + ", noCon=" + noCon + ", noRe=" + noRe + ", taza=" + taza + ", com=" + com
				+ "]";
	}
	
	
	
	
}
