package com.mayab.patrones.chainOfResponsability;

import java.util.Scanner;

public class WithdrawBank extends BankHandler{
	private static MoneyDispenser dispenser_1 = new FiveHundredDispenser();
	private static MoneyDispenser dispenser_2 = new TwoHundredDispenser();
	private static MoneyDispenser dispenser_3 = new OneHundredDispenser();
	private static MoneyDispenser dispenser_4 = new FiftyDispenser();
	private static MoneyDispenser dispenser_5 = new TwentyDispenser();
	private Scanner myObj;
	static {
		dispenser_1.setNext(dispenser_2);
		dispenser_2.setNext(dispenser_3);
		dispenser_3.setNext(dispenser_4);
		dispenser_4.setNext(dispenser_5);
	}
	@Override
	public void action() {
		myObj = new Scanner(System.in); 
	    System.out.println("Ingresa la cantidad a retirar: ");

	    String request_s =  myObj.nextLine(); 
	    int request = Integer.parseInt(request_s);
	    if(account.acceptTransaction(request)) {
	    dispenser_1.dispense(request);
	    account.setFunds(((int)account.funds - request));
	    }
	    else {
	    	System.out.println("Transaccion denegada");
	    }
	    nextAction.action();
	}

}
