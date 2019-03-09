package com.mayab.patrones.factoryMethod;

public class FactoryMethodController {
	public static void main(String[] args) {
		TrianguloCreator escalenoCreator = new EscCreator();
		TrianguloCreator equilateroCreator = new EqCreator();
		TrianguloCreator isoscelesCreator = new IsosCreator();
		
		Triangulo triangulo = escalenoCreator.createTriangulo("escaleno");
		System.out.println("Soy un triangulo: " + triangulo.getName() + "\n");
		System.out.println("Mi perimetro es: " + triangulo.calcularPerimetro() + "\n");
		System.out.println("Mi area es: " + triangulo.calcularArea() + "\n");
		
		triangulo = equilateroCreator.createTriangulo("equilatero");
		System.out.println("Soy un triangulo: " + triangulo.getName() + "\n");
		System.out.println("Mi perimetro es: " + triangulo.calcularPerimetro() + "\n");
		System.out.println("Mi area es: " + triangulo.calcularArea() + "\n");
		
		triangulo = isoscelesCreator.createTriangulo("isosceles");
		System.out.println("Soy un triangulo: " + triangulo.getName() + "\n");
		System.out.println("Mi perimetro es: " + triangulo.calcularPerimetro() + "\n");
		System.out.println("Mi area es: " + triangulo.calcularArea() + "\n");
	}
}
