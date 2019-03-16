package com.mayab.patrones.decorator;

public class Guacamole extends Decorator{

	Burger burger;
	
	public Guacamole(Burger burger) {
		this.burger = burger;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return burger.getDescription() + ", Guacamole";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return burger.cost() + 0.75;
	}

}
