package com.mayab.patrones.factoryMethod;

public abstract class TrianguloCreator {
	
	protected abstract Triangulo createTriangulo(String type);
	
	public Triangulo calcularMedidas(String type) {
		Triangulo triangulo = createTriangulo(type);
		
		return triangulo;
	}
}
