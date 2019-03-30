package com.mayab.patrones.template;

public abstract class TemplateController {

	public static void main(String[] args) {
		Persona julio = new Persona("Julio","25 Altabrisa",20);
		Persona alfonsina = new Persona("Alfonsina","12 Altabrisa",12);
		Producto ladrillos = new Producto("ANAJFON274",26.8);
		Producto peluche = new Producto("ANAJFOH9874",5.8);
		julio.update();
		alfonsina.update();
		ladrillos.update();
		peluche.update();
	}

}
