package com.mayab.patrones.decorator;

public abstract class Burger {
	public String nombre = "Burger";
	public String getDescription() {
		return nombre;
	}
	public abstract double cost();
}
