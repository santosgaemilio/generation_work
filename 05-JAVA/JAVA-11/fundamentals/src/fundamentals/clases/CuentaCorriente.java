package fundamentals.clases;

public class CuentaCorriente extends Cuenta{
	private float sobregiro = 0;
	public CuentaCorriente(float saldo, float taza) {
		super(saldo, taza);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void retirar() {
		super.retirar();
		//float base = getSaldo(); //100
		retirar(); //200
		//float estado = base - getSaldo(); //100 - 50 = 50  100 - (-200) = 300
		if(getSaldo() < 0) {
			this.sobregiro = getSaldo()*-1;
			setSaldo(0);
			
		}
	}
}
