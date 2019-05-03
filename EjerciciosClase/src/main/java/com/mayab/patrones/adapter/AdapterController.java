package com.mayab.patrones.adapter;

public class AdapterController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EjemploPersonaNueva benjamin = new EjemploPersonaNueva("Benjamin Monterroza",20);
		PersonaVieja benjaminAdaptado = new PersonaAdapter(benjamin);
		EjemploPersonaVieja carlos = new EjemploPersonaVieja("Carlos","Sanabria","27-07-2001");
		System.out.println("Persona vieja:");
		System.out.println("Nombre: " + carlos.getNombre());
		System.out.println("Apellido: " + carlos.getApellido());
		System.out.println("Fecha de Nacimiento: " + carlos.getFechaDeNacimiento());
		System.out.println("Persona nueva:");
		System.out.println("Nombre Completo: " + benjamin.getNombreCompleto());
		System.out.println("Edad: " + benjamin.getEdad());
		System.out.println("Persona adaptada:");
		System.out.println("Nombre: " + benjaminAdaptado.getNombre());
		System.out.println("Apellido: " + benjaminAdaptado.getApellido());
		System.out.println("Fecha de Nacimiento: " + benjaminAdaptado.getFechaDeNacimiento());
		//Cambios a persona adaptada
		EjemploPersonaNueva roberto = new EjemploPersonaNueva("Benjamin Monterroza",20);
		PersonaVieja robertoAdaptado = new PersonaAdapter(roberto);
		robertoAdaptado.setApellido("Lizama");
		robertoAdaptado.setNombre("Roberto");
		robertoAdaptado.setFechaDeNacimiento("05-07-1998");
		System.out.println("Persona adaptada modificada:");
		System.out.println("Nombre: " + robertoAdaptado.getNombre());
		System.out.println("Apellido: " + robertoAdaptado.getApellido());
		System.out.println("Fecha de Nacimiento: " + robertoAdaptado.getFechaDeNacimiento());
		
	}

}
