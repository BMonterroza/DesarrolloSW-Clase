package com.mayab.patrones.decorator;

public class Veggie extends Burger{
	public Veggie() {
		this.nombre += " Veggie";
	}
	@Override
	public double cost() {
		return 4.50;
	}
	
}
