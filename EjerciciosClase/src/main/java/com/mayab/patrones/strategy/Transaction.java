package com.mayab.patrones.strategy;

import java.util.*;

public class Transaction {
	private String categoria;
	private Date fecha;
	private double suma; 
    private String negocio;
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getSuma() {
		return suma;
	}
	public void setSuma(double suma) {
		this.suma = suma;
	}
	public String getNegocio() {
		return negocio;
	}
	public void setNegocio(String negocio) {
		this.negocio = negocio;
	}
    
}
