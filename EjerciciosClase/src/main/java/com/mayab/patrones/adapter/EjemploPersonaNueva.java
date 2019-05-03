package com.mayab.patrones.adapter;

public class EjemploPersonaNueva implements PersonaNueva{
	private String nombreCompleto;
	private int edad;
	public EjemploPersonaNueva(String nombre, int edad) {
		this.nombreCompleto = nombre;
		this.edad = edad;
	}
	@Override
	public String getNombreCompleto() {
		// TODO Auto-generated method stub
		return this.nombreCompleto;
	}

	@Override
	public void setNombreCompleto(String nombreCompleto) {
		// TODO Auto-generated method stub
		this.nombreCompleto = nombreCompleto;
	}

	@Override
	public int getEdad() {
		// TODO Auto-generated method stub
		return this.edad;
	}

	@Override
	public void setEdad(int edad) {
		// TODO Auto-generated method stub
		this.edad = edad;
	}

}
