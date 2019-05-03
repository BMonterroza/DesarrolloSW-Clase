package com.mayab.patrones.chainOfResponsability;

public class CreditAccount extends Account{
	@Override
	public boolean acceptTransaction(int request){
			return true;
	}
}
