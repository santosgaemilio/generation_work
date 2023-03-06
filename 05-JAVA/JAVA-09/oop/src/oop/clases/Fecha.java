package oop.clases;

public class Fecha {
	public int dia;
	public int mes;
	public int año;
	public Fecha(int dia, int mes, int año) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.año = año;
	}
	
	public String QueDiaEs() {
		return "Hoy es "+this.dia + "/" + this.mes + "/" + this.año;
	}

	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", año=" + año + "]";
	}
	
}
