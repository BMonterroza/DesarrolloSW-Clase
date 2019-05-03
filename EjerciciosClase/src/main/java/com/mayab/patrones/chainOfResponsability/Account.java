package com.mayab.patrones.chainOfResponsability;

public abstract class Account {
	public double funds;
	protected int NIP;
	public boolean validate(int NIP) {
		if(this.NIP == NIP) {
			return true;
		}
		else {
			return false;
		}
	}
	public void setNIP(int NIP) {
		this.NIP = NIP;
	}
	public void setFunds(int funds) {
		this.funds = funds;
	}
	public abstract boolean acceptTransaction(int request);
}
