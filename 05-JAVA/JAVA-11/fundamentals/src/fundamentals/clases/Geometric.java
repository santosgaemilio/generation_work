package fundamentals.clases;

public abstract class Geometric {
	private String name;
	public Geometric(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract double areas();
	public abstract void data();
//	Se define el método abstracto o sea que no tiene propiedades ni funciones
//	solo se llama. Para que la clase sea realmente abstracta necesita al menos
//	un método abstracto
	@Override
	public String toString() {
		return "Geometric [name=" + name + ", areas()=" + areas() + "]";
	}
}
