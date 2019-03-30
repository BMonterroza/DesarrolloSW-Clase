package com.mayab.patrones.proxy;

public class FileImp implements File{

	public String nombre;
	
	public FileImp(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public void borrar() {
		System.out.println("El archivo " + nombre + " ha sido borrado.");
	}

	@Override
	public void escribir() {
		System.out.println("Ahora puedes escribir sobre el archivo " + nombre);
	}

	@Override
	public void leer() {
		System.out.println("Ahora puedes leer el archivo " + nombre);
	}

}
