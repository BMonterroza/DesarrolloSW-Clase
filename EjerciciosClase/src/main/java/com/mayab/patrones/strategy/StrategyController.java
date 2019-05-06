package com.mayab.patrones.strategy;

import java.util.*;

public class StrategyController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaBanco prueba = new CuentaBanco();
		Transaction t1 = new Transaction();
		t1.setCategoria("A");
		Date date = new Date();
		t1.setFecha(date);
		t1.setNegocio("C");
		t1.setSuma(10);
		Transaction t2 = new Transaction();
		t2.setCategoria("B");
		Date date2 = new Date();
		t1.setFecha(date2);
		t1.setNegocio("A");
		t1.setSuma(100);
		prueba.addTransaction(t1);
		prueba.addTransaction(t2);
		prueba.ordenar("fecha");
	}

}
