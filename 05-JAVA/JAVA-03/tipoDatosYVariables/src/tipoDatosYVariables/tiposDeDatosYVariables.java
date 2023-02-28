package tipoDatosYVariables;

public class tiposDeDatosYVariables {
	// El nombre de la case está mal pero ni modo

    public static void main(String[] args) {
    

        byte centigrados = 1;
        double fahrenheit = (centigrados * 1.8) + 32;
        double kelvin = centigrados + 273.15;

        System.out.println("1 centigrado a fahrenheit es " + fahrenheit);
        System.out.println("1 centigrado a kelvin es " + kelvin);
        /*
         * ºF = ºC x 1.8 + 32 formula para convertir grados centigrados a fahrenheit K =
         * ºC + 273.15
         */
        
        
        byte horasTrabajadas = 8;
        byte pagoPorHora = 10;
        int multiplicacion = horasTrabajadas*pagoPorHora;
        // Se usa byte por que es el menor de los enteros y no necesitamos tantos 
        // decimales. Int está bien sobrado pero ni pedo
        System.out.println(multiplicacion);
        
        
        // Conversiones de tipos de variables
        double num = 1.61;
        int numInt = (int) num;
        // No tiene lógica pero el metodo es el que va en paréntesis xd
        long numLong = (long) num;
	    System.out.println("double: " + num);
	    System.out.println("int: " + numInt);
	    System.out.println("long: " + numLong);
	    
	    
	    //string

	    String cantidad ="15";
	    String precio = "115.20";


	    int cantEntero = Integer.parseInt(cantidad);  
	    double precioDouble = Double.parseDouble(precio);
	    // Primero se pone el tipo de dato al que se va a convertir el string
	    // y luego el punto y luego el método. Un poco raro, creo que es por que
	    // el Integer y Double son la clase y el otro el método de la clase!


	    System.out.println("El valor total de la compra es: "+ (cantEntero * precioDouble));
	    
	    int edad = 30;
	    double estatura = 1.61;
	     
	    

	    String edadString = String.valueOf(edad);
	    String estaturaString = String.valueOf(estatura); 
	    // y ahi mismo te da todos los valores que puedes utilizar para hacer conversion 

	    System.out.println("Edad: " + edadString);
	    
	    // Operadores y relacionales
	    double numero1 = 5;
        double numero2 = 7;
        int numero3 =12;
        
//        int suma = numero1 + numero2 + numero3; //operador +, esperamos un 24
//        int resta = numero1 - numero2 - numero3; //esperamos -14
//        int multiplicacion_2 = numero1 * numero2 * numero3; //operador *, esperamos 420
        double division = numero2 / numero1; //operador /, esperamos 1,4
//        int modulo = numero2 % numero1; //operador %, esperamos un 2
        int incremento = ++numero3;
//        int decremento= --numero2;
        
//        System.out.println("La suma es: "+ suma);
//        System.out.println("La resta es: "+ resta);
//        System.out.println("La multiplicación es: "+ multiplicacion_2);
        System.out.println("La división es: "+ division);
//        System.out.println("La modulo es: "+ modulo);
        System.out.println("El incremento es: "+ incremento);
//        System.out.println("El decremento: "+ decremento);
        
        // Comenté todo por que para que te de una división double también 
        // los argumentos son double
        
        // Ejemplo 1
        
        float num1 = 3;
        float num2 = 2;
        float num3 = 2;
        float num4 = 5;
        float sumaf = num1 + num2;
        float multiplicaciónf = num3 * num4;
        float divisiónf = sumaf / multiplicaciónf;

        System.out.println(sumaf);
        System.out.println(multiplicaciónf);
        System.out.println(divisiónf);
        
        // Ejercicio 1
        byte numA = 5;
        byte numB = 55;
	    byte numC = 60;
	    
	    int mult = numA * numB;
	    int res = numC % numB; 
	    
	  
	    System.out.println(mult);
	    System.out.println(res);
	    
	    // Ejercicio 2
	    
	    boolean correcto = true;
	    boolean incorrecto = false;
	    System.out.println(correcto == incorrecto);
	    
	    // Ejercicio 3
	    double numD = 23.345;
	    double numE = 34.234;
	    System.out.println(numD < numE);
	    
	    // Ejercicio 4
	    double far = 102;
	    double kel = (far - 32)/1.8 + 273.15;
	    double cent = (far - 32)/1.8;
	    System.out.println("En Kelvin es "+kel+" y en Centigrados "+cent);
	    
	    short numCheck = 114;
	    
	    if(numCheck % 2 == 0) {
	    	System.out.println("par");
	    }else {
	    	System.out.println("impar");
	    }
    }
    

}