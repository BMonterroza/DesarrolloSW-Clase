package com.mayab.patrones.iterator;

import java.util.*;

public class IngCivil {
	private Queue<Alumno> alumnos;
	private String nombre;
	public IngCivil(Queue<Alumno> alumnos, String nombre) {
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