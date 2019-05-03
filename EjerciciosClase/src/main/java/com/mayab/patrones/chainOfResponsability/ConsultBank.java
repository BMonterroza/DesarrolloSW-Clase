package com.mayab.patrones.chainOfResponsability;

public class ConsultBank extends BankHandler{

	@Override
	public void action() {
		System.out.println("Sus fondos actuales son de: " + account.funds + " MXN");
	}

}
