package com.mayab.patrones.proxy;

public class Usuario {
	
	public String nombre;
	public String tipo;
	
	public Usuario(String nombre, String tipo) {
		this.nombre = nombre;
		this.tipo = tipo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getTipo() {
		return tipo;
	}
}
