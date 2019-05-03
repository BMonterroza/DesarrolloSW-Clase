package com.mayab.patrones.strategy;

import java.util.ArrayList;

public class CuentaBanco {
	private ArrayList<Transaction> transacciones;
	private double caja;
	public void addTransaction(Transaction transaccion) {
		transacciones.add(transaccion);
	}
	public double getCaja() {
		return caja;
	}
	public void setCaja(double caja) {
		this.caja = caja;
	}
}
