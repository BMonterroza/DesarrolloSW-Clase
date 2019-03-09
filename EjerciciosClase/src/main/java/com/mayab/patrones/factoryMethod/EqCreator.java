package com.mayab.patrones.factoryMethod;

public class EqCreator extends TrianguloCreator{

	@Override
	protected Triangulo createTriangulo(String item) {
		if(item.equals("equilatero")) {
			return new EqTri();
		}
		else {
			return null;
		}
	}

}
