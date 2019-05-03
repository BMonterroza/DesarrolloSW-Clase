package com.mayab.patrones.iterator;

import java.util.*;

public class IngInformatica {
	private ArrayList<Alumno> alumnos;
	private String nombre;
	public IngInformatica(ArrayList<Alumno> alumnos, String nombre) {
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
