package com.mayab.patrones.proxy;

public class ProxyController {

	public static void main(String[] args) {
		Usuario benja = new Usuario("Benjamin","Super");
		Usuario carlos = new Usuario("Carlos","Normal");
		ProxyFile File = new ProxyFile(benja);
		File.CrearFile("TrabajoFinal");
		File.leer();
		File.escribir();
		File.borrar();
		System.out.println();
		File = new ProxyFile(carlos);
		File.CrearFile("Ensayo_2");
		File.leer();
		File.escribir();
		File.borrar();
	}

}
