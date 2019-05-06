package com.mayab.patrones.strategy;

import java.util.ArrayList;

public class SortCantidad implements SortBehaviour{

	@Override
	public ArrayList<Transaction> sort(ArrayList<Transaction> transacciones) {
		// TODO Auto-generated method stub
		int index = 0;
		ArrayList<Transaction> answer = new ArrayList<Transaction>();
		for(Transaction  transaction : transacciones) {
			if(index == 0) {
				answer.add(transaction);
			}else {
				if(answer.get(index-1).getSuma() > transaction.getSuma() ) {
					answer.add(index, transaction);
				}
				else if(answer.get(index-1).getSuma() < transaction.getSuma()) {
					answer.add(index-1, transaction);
				} else {
					answer.add(index, transaction);
				}
			}
			index++;
		}
		return answer;
	}
	
}
