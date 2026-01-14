package com.endes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	Calculadora calculadora;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("setupBeforeClass()");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setup()");
		
		calculadora = new Calculadora();
	}
	
	@Test
	@DisplayName("Prueba unitaria del constructor vacio")
	void testConstructor() {
		int num1Esperado = 0;
		int num2Esperado = 0;
		
		int num1 = calculadora.getNum1();
		int num2 = calculadora.getNum2();
		
		
		assertEquals(num1Esperado, num1, "Debería de ser 0");
		assertEquals(num2Esperado, num2, "Debería de ser 0");
	}
	@Test
	@DisplayName("Prueba unitaria de la función sumar")
	void testSuma() {
		int resultadoEsperado = 0;
		int resultado = calculadora.sumar();
		
		assertEquals(resultadoEsperado, resultado);
	}
	
	@Test
	@DisplayName("Prueba unitaria de la funcioón restar")
	void testResta() {
		int resultadoEsperado = 0;
		int resultado = calculadora.restar();
		
		assertEquals(resultadoEsperado, resultado);
	}

}
