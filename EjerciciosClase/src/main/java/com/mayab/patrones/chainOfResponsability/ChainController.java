package com.mayab.patrones.chainOfResponsability;

public class ChainController {

	public static void main(String[] args) {
		Account Benji = new DebitAccount();
		Benji.setNIP(1234);
		Benji.setFunds(15000);
		BankHandler ATM = new WithdrawBank();
		System.out.println("Bienvenido a nuestra red de ATMs");
		if(Benji.validate(1234)) {
			ATM.setAccount(Benji);
			ATM.setNext(1);
			ATM.action();
		}
		else {
			System.out.println("Error en NIP");
		}
	}

}
