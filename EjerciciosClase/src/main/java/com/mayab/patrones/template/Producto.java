package com.mayab.patrones.template;

public class Producto extends Catalogo{
	public String codigoBarras;
	public double precio;
	public Producto(String CodigoBarras, double precio) {
		this.codigoBarras = CodigoBarras;
		this.precio = precio;
	}
	@Override
	boolean validarDatos() {
		if(precio>10) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
