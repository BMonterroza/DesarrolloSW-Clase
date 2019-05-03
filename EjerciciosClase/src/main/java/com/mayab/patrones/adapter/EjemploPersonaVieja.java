package com.mayab.patrones.adapter;

public class EjemploPersonaVieja implements PersonaVieja{
	private String nombre;
	private String apellido;
	private String fechaDeNacimiento;
	public EjemploPersonaVieja(String nombre, String apellido, String fechaDeNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		this.nombre = nombre;
	}

	@Override
	public String getApellido() {
		// TODO Auto-generated method stub
		return this.apellido;
	}

	@Override
	public void setApellido(String apellido) {
		// TODO Auto-generated method stub
		this.apellido = apellido;
	}

	@Override
	public String getFechaDeNacimiento() {
		// TODO Auto-generated method stub
		return this.fechaDeNacimiento;
	}

	@Override
	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		// TODO Auto-generated method stub
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	

}
