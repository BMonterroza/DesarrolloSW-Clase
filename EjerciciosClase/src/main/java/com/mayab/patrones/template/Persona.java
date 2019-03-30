package com.mayab.patrones.template;

public class Persona extends Catalogo{
	public String nombre;
	public String direccion;
	public int edad;
	public Persona(String nombre, String direccion, int edad) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.edad = edad;
	}
	@Override
	boolean validarDatos() {
		// TODO Auto-generated method stub
		if(edad>18) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
