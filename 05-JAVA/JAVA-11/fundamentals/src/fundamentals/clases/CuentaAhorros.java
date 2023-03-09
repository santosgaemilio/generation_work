package fundamentals.clases;

import java.security.PublicKey;

public class CuentaAhorros extends Cuenta{
	private boolean activa;
	
	
	public CuentaAhorros(float saldo, float taza) {
		super(saldo, taza);
		if(saldo<10000) {
			this.activa = false;
		}else {
			this.activa = true;
		}
	}
	
	@Override
	public void consignar() {
		super.consignar();
		if(this.activa == true) {
			consignar();
		}else {
			System.out.println("Cuenta no activa");
		}
	}
	
	@Override
	public void retirar() {
		super.retirar();
		if(this.activa == true) {
			retirar();
		}else {
			System.out.println("Cuenta no activa");
		}
		
	}
	
	@Override
	public void extractoMensual() {
		// TODO Auto-generated method stub
		super.extractoMensual();
		if (getNoRe()>4) {
			setCom(getCom()+(1000*getNoRe()));
		}
		setSaldo(getSaldo()-getCom());
		if(saldo<10000) {
			this.activa = false;
			System.out.println("Cuenta inactiva");
		}else {
			this.activa = true;
			System.out.println("Cuenta activa");
		}
	}
	public void imprimir() {
		int trans = getNoCon() + getNoRe();
		System.out.println("El saldo es de: "+getSaldo()+" la comisión mensual es de: "+getCom()+" el número de transacciones es de: "+trans);
	}
	
	
}
