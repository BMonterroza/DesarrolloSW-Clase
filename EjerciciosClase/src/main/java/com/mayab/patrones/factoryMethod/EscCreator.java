package com.mayab.patrones.factoryMethod;

public class EscCreator extends TrianguloCreator{

	@Override
	protected Triangulo createTriangulo(String item) {
		if(item.equals("escaleno")) {
			return new EscTri();
		}
		else {
			return null;
		}
	}

}
