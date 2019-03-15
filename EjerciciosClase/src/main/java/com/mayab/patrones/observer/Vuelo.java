package com.mayab.patrones.observer;

import java.util.ArrayList;

public class Vuelo implements Observable {
	public ArrayList<Observer> Pasajeros = new ArrayList<Observer>();
	public String sala;
	public String salida;
	public String estado;
	public String destino;
	
	public Vuelo(String salita, String salidita, String estadito, String destinito) {
		sala = salita;
		salida = salidita;
		estado = estadito;
		destino = destinito;
	}
	public void setSala(String foo) {
		sala = foo;
		notifyObservers();
	}
	public void setSalida(String foo) {
		salida = foo;
		notifyObservers();
	}
	public void setEstado(String foo) {
		estado = foo;
		notifyObservers();
	}
	public void setDestino(String foo) {
		destino = foo;
		notifyObservers();
	}
	@Override
	public String[] getState() {
		// TODO Auto-generated method stub
		String[] State = new String[4];
		State[0] = sala;
		State[1] = salida;
		State[2] = estado;
		State[3] = destino;
		return State;
	}
	@Override
	public void addObserverToList(Observer foo) {
		Pasajeros.add(foo);
	}
	@Override
	public void deleteObserverFromList(Observer foo) {
		Pasajeros.remove(foo);
	}
	@Override
	public void notifyObservers() {
		for(Observer Pasajero:Pasajeros) {
			Pasajero.update();
		}
	}
}
