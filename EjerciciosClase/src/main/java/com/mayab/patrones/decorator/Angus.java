package com.mayab.patrones.decorator;

public class Angus extends Burger{
	public Angus() {
		this.nombre += " Angus";
	}
	@Override
	public double cost() {
		return 6.50;
	}

}
