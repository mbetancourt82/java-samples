package com.mbetancourt.basic;

public class Cuadrado {
	
	private int lado;

	
	public Cuadrado(int lado) {
		super();
		this.lado = lado;
	}
	
	public Cuadrado() {
		super();
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
	public int calcularArea() {
		return lado*lado;
	}
	
}
