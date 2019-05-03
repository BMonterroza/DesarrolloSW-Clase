package com.mayab.patrones.chainOfResponsability;

public class DebitAccount extends Account{

	@Override
	public boolean acceptTransaction(int request){
		if((double)request > funds) {
			return false;
		}
		else {
			return true;
		}
	}
	
}
