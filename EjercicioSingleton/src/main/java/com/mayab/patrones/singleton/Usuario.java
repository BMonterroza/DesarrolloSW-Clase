package com.mayab.patrones.singleton;

public class Usuario {
	private static Usuario Instancia;
	private boolean Loged = false;
	private String Nombre = "Vacío";
	private String Apellido = "Vacío";
	private Usuario() {
		
	}
	public static Usuario getInstance() {
		if(Usuario.Instancia == null) {
			Usuario.Instancia = new Usuario();
		}
		return Usuario.Instancia;
	}
	public void LogIn() {
		Loged = true;
	}
	public void LogOut() {
		Loged = false;
	}
	public boolean IsLoged() {
		return Loged;
	}
	public String getNombre() {
		return Nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setNombre(String foo) {
		Nombre = foo;
	}
	public void setApellido(String foo) {
		Apellido = foo;
	}
}
