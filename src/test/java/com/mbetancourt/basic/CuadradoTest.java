package com.mbetancourt.basic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CuadradoTest {

	@Test
	@DisplayName("Probando constructor y .calcularArea")
	void test() {
		int area=0;
		Cuadrado c = new Cuadrado(5);
		area = c.calcularArea();
		assertEquals(25,area);
		
		
	}
	
	@Test
	@DisplayName("Probando getter y setter")
	void test2() {
		Cuadrado c = new Cuadrado();
		c.setLado(4);
		assertEquals(4,c.getLado());		
	}

}
