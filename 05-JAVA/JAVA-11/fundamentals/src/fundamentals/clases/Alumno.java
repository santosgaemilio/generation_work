package fundamentals.clases;

public class Alumno extends Persona{
	private String matricula;
	private double promedio;
	public Alumno(String matricula, double promedio, String nombre, int edad) {
		super(nombre, edad);
		this.matricula = matricula;
		this.promedio = promedio;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getPromedio() {
		return promedio;
	}
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	@Override
	public String toString() {
		return "Alumno [matricula=" + matricula + ", promedio=" + promedio + "]";
	}
	public void mostrarDatos() {
		System.out.println(this.getNombre() + ", "+this.getEdad()+", "+this.getMatricula()+", "+this.getPromedio());
	}
	
}
