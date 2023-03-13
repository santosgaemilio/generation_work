package unittestingJUnit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import unittestingJUnit.app.Calculadora;

class CalculadoraTest { 
	private Calculadora ct;
	
	@BeforeEach
	public void configurandoBefore() {
		ct = new Calculadora();
		System.out.println("Se ejecuta el before");
	}
	
	@AfterEach
	public void configurandoAfter() {
		System.out.println("Se acabó la prueba");
	}
//	@Test
//	public void calculadoraNull() { 
//		assertNull(ct);
//		System.out.println("first test");
//		
//
//	}
//	@Test
//	public void calculadoraNotNull() {
//		assertNotNull(ct);
//		System.out.println("second test");
//		
//
//	}
	
//	Primeras pruebas
	@Disabled
	@Test
	public void primerosAssert() {
		/*
		 * 1- Indicar que se va a evaluar
		 * 2- Indicar lo qwu
		 */
		int resultadoEsperado = 10;
		int resultado = ct.sumar(5, 5);
		assertEquals(resultadoEsperado, resultado, "good");
		System.out.println("compli");
	}
	@Disabled
	@Test
	public void sumaTest() {
		assertEquals(20, ct.sumar(10, 10));
		System.out.println("simple");
	}
	
	/************************* TIPOS DE TEST ***************************** */
	
	@Disabled
	@Test
	public void tiposAsserts() {
		assertTrue(1 == 1);
	}
	@Disabled
	@Test
	public void tiposAsserts2() {
		
		Calculadora c2 = new Calculadora();
		Calculadora c3 = new Calculadora();
		
		//assertSame(c2, c3);
		assertEquals(1, 1.5,0.5);
//		El tercer parámetro de assertEquals te dice el margen de tolerancia
	} 
	@Disabled
	@Test
	public void validSuma() {
		assertEquals(50, ct.sumar(49, 1));
		System.out.println("suma validada");
	} 
	@Disabled
	@Test
	public void validResta() {
		assertEquals(48, ct.restar(49, 1));
		System.out.println("resta validada");
	}
	@Disabled
	@Test
	public void validDivision() {
		assertEquals(4, ct.dividir(12, 3));
		System.out.println("división validada");
	}
//	el @Dissable
	@Test
	public void validCero() {
		assertThrows(ArithmeticException.class, ()->ct.dividir(23, 0),
				"No se puede dividir por 0");
		System.out.println("Se checó el rollo del cero");
	}
 
}
