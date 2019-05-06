package com.mayab.patrones.strategy;

import java.util.ArrayList;

public class CuentaBanco {
	private ArrayList<Transaction> transacciones = new ArrayList<Transaction>();
	private SortBehaviour tool;
	private double caja;
	public void addTransaction(Transaction transaccion) {
		this.transacciones.add(transaccion);
	}
	public void ordenar(String tipo) {
		if(tipo == "fecha") {
			tool = new SortFecha();
			ArrayList<Transaction> prueba = tool.sort(transacciones);
			for(Transaction t : prueba) {
				System.out.println(t.getFecha());
			}
		}else if(tipo == "comercio") {
			tool = new SortComercio();
			ArrayList<Transaction> prueba = tool.sort(transacciones);
			for(Transaction t : prueba) {
				System.out.println(t.getNegocio());
			}
		} else if(tipo == "cantidad") {
			tool = new SortCantidad();
			ArrayList<Transaction> prueba = tool.sort(transacciones);
			for(Transaction t : prueba) {
				System.out.println(t.getSuma());
			}
		} else if(tipo == "categoria") {
			tool = new SortCategoria();
			ArrayList<Transaction> prueba = tool.sort(transacciones);
			for(Transaction t : prueba) {
				System.out.println(t.getCategoria());
			}
		}
	}
	public double getCaja() {
		return caja;
	}
	public void setCaja(double caja) {
		this.caja = caja;
	}
}
