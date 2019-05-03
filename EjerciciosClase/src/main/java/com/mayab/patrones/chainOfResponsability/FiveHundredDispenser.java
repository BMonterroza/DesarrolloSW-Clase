package com.mayab.patrones.chainOfResponsability;

public class FiveHundredDispenser extends MoneyDispenser{
	private int amount;
	@Override
	public void dispense(int request) {
		amount = (int) Math.floor(request / 500);
		if(amount-1>0) {
			System.out.println("Se te han entregado " + (amount-1) + " billetes de 500");
			request = request - ((amount-1)*500);
		}
		if(request == 0) {
			System.out.println("Se te ha entregado todo el dinero solicitado");
		}
		else {
			nextDispenser.dispense(request);
		}
	}
	
}
