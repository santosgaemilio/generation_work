package clases;

//import java.lang.reflect.Method;
//import java.util.Scanner;

// import java.lang.invoke.VarHandle;
// Cuando hice el constructor apareció este import, lo voy a comentar a ver si
// funciona

public class NuevoHola {
	//private String name;
	
	// Para usar una variable (objeto tipo String)
	// usamos el método constructor (La pregunta estuvo confusa)

	public NuevoHola() {
		//super();
		// El super es algo de la herencia
		
	}
	
//	public void saludo() {
//		System.out.println("Hola desde Java con sts de nuez " + this.name);
//	}
//	
	public void pedirNameSaludo(String name) {
		System.out.println("Hola tu eres: " + name);
	}
	
}
