package com.mayab.patrones.iterator;

import java.util.*;

public class IngMecatronica {
	private List<Alumno> alumnos;
	private String nombre;
	public IngMecatronica(List<Alumno> alumnos, String nombre) {
		this.setNombre(nombre);
		this.alumnos = alumnos;
	}
	public Iterator createIterator() {
		return alumnos.iterator();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
