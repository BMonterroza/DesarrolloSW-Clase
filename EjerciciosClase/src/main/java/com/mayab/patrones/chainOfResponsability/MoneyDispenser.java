package com.mayab.patrones.chainOfResponsability;

public abstract class MoneyDispenser {
	protected MoneyDispenser nextDispenser;
	public void setNext(MoneyDispenser nextDispenser) {
		this.nextDispenser = nextDispenser;
	}
	public abstract void dispense(int request);
}
