package com.mayab.patrones.observer;

public class ObserverController {

	public static void main(String[] args) {
		Vuelo vuelo = new Vuelo("5","11:30 PM","A tiempo","Cancún");
		Pasajero pasajero = new Pasajero("Luis", vuelo);
		vuelo.addObserverToList(pasajero);
		vuelo.setEstado("Retrasado");
		vuelo.setSala("15");
		vuelo.setEstado("A tiempo");
		vuelo.deleteObserverFromList(pasajero);
		vuelo.setSala("10");
	}

}
