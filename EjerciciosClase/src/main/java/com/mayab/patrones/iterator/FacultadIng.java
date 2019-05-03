package com.mayab.patrones.iterator;

import java.util.*;

public class FacultadIng {
	private IngCivil civiles;
	private IngInformatica informaticos;
	private IngIndustrial industriales;
	private IngMecatronica mecatronicos;
	public FacultadIng(IngCivil civ,IngIndustrial ind, IngInformatica inf, IngMecatronica meca) {
		civiles = civ;
		informaticos = inf;
		industriales = ind;
		mecatronicos = meca;
	}
	public void print(Iterator iterador){
		while(iterador.hasNext()) {
			System.out.println(((Alumno)iterador.next()).getNombre());
		}
	}
	public void pasarLista() {
		System.out.println("Ing. civil: ");
		print(civiles.createIterator());
		System.out.println("Ing. informatica: ");
		print(informaticos.createIterator());
		System.out.println("Ing. industrial: ");
		print(industriales.createIterator());
		System.out.println("Ing. mecatronica: ");
		print(mecatronicos.createIterator());
	}
	
}
