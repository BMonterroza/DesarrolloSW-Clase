package com.mayab.patrones.strategy;

import java.util.ArrayList;

public class SortComercio implements SortBehaviour{

	@Override
	public ArrayList<Transaction> sort(ArrayList<Transaction> transacciones) {
		// TODO Auto-generated method stub
		int index = 0;
		ArrayList<Transaction> answer = new ArrayList<Transaction>();
		for(Transaction  transaction : transacciones) {
			if(index == 0) {
				answer.add(transaction);
			}else {
				if(answer.get(index-1).getCategoria().charAt(0) > transaction.getCategoria().charAt(0) ) {
					answer.add(index, transaction);
				}
				else if(answer.get(index-1).getCategoria().charAt(0) < transaction.getCategoria().charAt(0) ) {
					answer.add(index-1, transaction);
				} else {
					if(answer.get(index-1).getCategoria().charAt(1) > transaction.getCategoria().charAt(1) ) {
						answer.add(index, transaction);
					}
					else if(answer.get(index-1).getCategoria().charAt(1) < transaction.getCategoria().charAt(1) ) {
						answer.add(index-1, transaction);
					}
				}
			}
			index++;
		}
		return answer;
	}

}
