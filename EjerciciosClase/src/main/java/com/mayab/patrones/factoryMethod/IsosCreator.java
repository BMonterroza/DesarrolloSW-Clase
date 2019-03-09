package com.mayab.patrones.factoryMethod;

public class IsosCreator extends TrianguloCreator{

	@Override
	protected Triangulo createTriangulo(String item) {
		if(item.equals("isosceles")) {
			return new IsosTri();
		}
		else {
			return null;
		}
	}

}
