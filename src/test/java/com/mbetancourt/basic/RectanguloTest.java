package com.mbetancourt.basic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectanguloTest {

	@Test
	void testCalculaArea() {
		int esperado = 0;
		int area = 0;
		for(int i = 1;i<=10;i++) {
			for (int j=0;j<=10;j++) {
				esperado = i*j;
				Rectangulo r = new Rectangulo(i,j);
				
				r.setBase(i);
				r.setAltura(j);
				
				area = r.calculaArea();
				assertEquals(esperado,area);
				/*Rectangulo r = new Rectangulo(4,5);
				area = r.calculaArea();
				assertEquals(20,area);*/
				assertEquals(i, r.getBase());
				assertEquals(j, r.getAltura());
			}
		}
		
	
		
		
	}

}
