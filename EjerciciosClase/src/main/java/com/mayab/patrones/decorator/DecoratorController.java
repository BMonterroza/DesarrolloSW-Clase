package com.mayab.patrones.decorator;

public class DecoratorController {

	public static void main(String[] args) {
		Burger hamburguesa1 = new Veggie();
		System.out.println(hamburguesa1.getDescription());
		System.out.println(hamburguesa1.cost());
		hamburguesa1 = new Bacon(hamburguesa1);
		System.out.println(hamburguesa1.getDescription());
		System.out.println(hamburguesa1.cost());
		Burger hamburguesa2 = new Angus();
		System.out.println(hamburguesa2.getDescription());
		System.out.println(hamburguesa2.cost());
		hamburguesa2 = new Guacamole(hamburguesa2);
		System.out.println(hamburguesa2.getDescription());
		System.out.println(hamburguesa2.cost());
	}

}
