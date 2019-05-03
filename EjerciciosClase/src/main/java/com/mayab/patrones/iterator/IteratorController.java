package com.mayab.patrones.iterator;

import java.util.*;

public class IteratorController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno carlos = new Alumno("Carlos");
		Alumno mauricio = new Alumno("Mauricio");
		Alumno sebastian = new Alumno("Sebastian");
		Alumno alan = new Alumno("Alan");
		Alumno lorena = new Alumno("Lorena");
		Alumno luciana = new Alumno("Luciana");
		Alumno patricio = new Alumno("Patricio");
		Alumno antonio = new Alumno("Antonio");
		Alumno karen = new Alumno("Karen");
		Queue<Alumno> listaCiviles = new LinkedList<Alumno>();
		listaCiviles.add(lorena);
		listaCiviles.add(luciana);
		Alumno[] listaIndustriales = {carlos,mauricio};
		ArrayList<Alumno> inf = new ArrayList<Alumno>();
		inf.add(alan);
		inf.add(sebastian);
		inf.add(karen);
		List<Alumno> meca = new ArrayList<Alumno>();
		meca.add(patricio);
		meca.add(antonio);
		IngCivil civiles = new IngCivil(listaCiviles, "Ing. Civil");
		IngInformatica informaticos = new IngInformatica(inf, "Ing. Informatica");
		IngIndustrial industriales = new IngIndustrial(listaIndustriales, "Ing. Industrial");
		IngMecatronica mecatronicos = new IngMecatronica(meca, "Ing. Mecatronica");
		FacultadIng facultad = new FacultadIng(civiles,industriales,informaticos,mecatronicos);
		facultad.pasarLista();
		
	}

}
