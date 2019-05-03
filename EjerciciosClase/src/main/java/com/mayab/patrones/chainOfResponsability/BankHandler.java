package com.mayab.patrones.chainOfResponsability;

public abstract class BankHandler {
	
	protected Account account;
	protected BankHandler nextAction;
	public final void setNext(int action) {
		if(action == 1) {
			nextAction = new ConsultBank();
			nextAction.setAccount(account);
		}
		else if (action == 2) {
			nextAction = new WithdrawBank();
			nextAction.setAccount(account);
		}
		else {
			System.out.println("Error acción no valida");
		}
	}
	public final void setAccount(Account account) {
		this.account = account;
	}
	public abstract void action();
}
