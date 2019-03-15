package com.mayab.patrones.observer;

public class Pasajero implements Observer{
	public String name;
	public Vuelo vuelo;
	public String[] info;
	
	public Pasajero(String nombre, Vuelo vuelito) {
		name = nombre;
		vuelo = vuelito;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String foo) {
		name = foo;
	}
	
	public void alertar() {
		System.out.println("Estimado " + name + " te notificamos que tu vuelo esta " + info[2] + " y va salir a las " + info[1] + " en la sala " + info[0] + " y va a partir hacia " + info[3]);
	}
	public Vuelo getVuelo() {
		return vuelo;
	}
	public void setVuelo(Vuelo foo) {
		vuelo = foo;
	}
	@Override
	public void update() {
		info = vuelo.getState();
		alertar();
	}
}
