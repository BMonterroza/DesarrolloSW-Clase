package com.mayab.patrones.iterator;

import java.util.*;

public class IngIndustrial {
	private Alumno[] alumnos;
	private String nombre;
	public IngIndustrial(Alumno[] alumnos, String nombre) {
		this.setNombre(nombre);
		this.alumnos = alumnos;
	}
	public Iterator createIterator() {
		return Arrays.asList(alumnos).iterator();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
