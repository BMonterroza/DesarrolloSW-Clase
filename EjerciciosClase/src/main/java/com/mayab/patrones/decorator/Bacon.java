package com.mayab.patrones.decorator;

public class Bacon extends Decorator{
	Burger burger;
	
	public Bacon(Burger burger) {
		this.burger = burger;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return burger.getDescription() + ", Bacon";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return burger.cost() + 1.50;
	}
	
}
