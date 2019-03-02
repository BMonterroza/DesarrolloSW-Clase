package com.mayab.patrones.singleton;

public class ControllerUsuario {

	public static void main(String[] args) {
		Usuario usuario1 = Usuario.getInstance();
		usuario1.setApellido("Monterroza");
		usuario1.setNombre("Benjamin");
		System.out.println("Nombre: " + usuario1.getNombre());
		System.out.println("Apellido: " + usuario1.getApellido());
		System.out.println("Is Loged?: " + usuario1.IsLoged());
		usuario1.LogIn();
		System.out.println("Is Loged?: " + usuario1.IsLoged());
		usuario1.LogOut();
		System.out.println("Is Loged?: " + usuario1.IsLoged());
		usuario1.LogIn();
		System.out.println("Is Loged?: " + usuario1.IsLoged());
		Usuario usuario2 = Usuario.getInstance();
		System.out.println("Nombre: " + usuario2.getNombre());
		System.out.println("Apellido: " + usuario2.getApellido());
		System.out.println("Is Loged?: " + usuario2.IsLoged());
		usuario2.LogOut();
		System.out.println("Is Loged?: " + usuario1.IsLoged());
		
	}

}
