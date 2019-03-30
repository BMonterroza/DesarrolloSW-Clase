package com.mayab.patrones.template;

public abstract class Catalogo {
	final void update() {
		leerDatos();
		if(validarDatos()) {
			guardar();
		}
		else {
			error();
		}
	};
	void leerDatos() {
		System.out.println("Estamos leyendo tus datos.");
	}
	void guardar() {
		System.out.println("Tus datos han sido guardados.");
	}
	void error() {
		System.out.println("Ha ocurrido un error en el guardado.");
	}
	abstract boolean validarDatos();
}
