package com.mayab.patrones.factoryMethod;

public abstract class Triangulo {
	String name;
	double lados[] = new double[3];
	
	public double calcularPerimetro() {
		double perimetro = lados[0] + lados[1] + lados[2];
		return perimetro;
	}
	public double calcularArea() {
		double s = (lados[0] + lados[1] + lados[2])/2;
		double area = Math.sqrt(s*(s-lados[0])*(s-lados[1])*(s-lados[2]));
		return area;
	}
	public String getName() {
		return name;
	}
}
