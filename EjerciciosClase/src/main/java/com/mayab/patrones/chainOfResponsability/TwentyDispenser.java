package com.mayab.patrones.chainOfResponsability;

public class TwentyDispenser extends MoneyDispenser{
	private int amount;
	@Override
	public void dispense(int request) {
		amount = (int) Math.floor(request / 20);
		if(amount>0) {
			System.out.println("Se te han entregado " + amount + " billetes de 20");
			request = request - (amount*20);
		}
		if(request == 0) {
			System.out.println("Se te ha entregado todo el dinero solicitado");
		}
		else {
			nextDispenser.dispense(request);
		}
	}
}
