package com.mayab.patrones.observer;

public interface Observable {
	public String[] getState();
	public void addObserverToList(Observer foo);
	public void deleteObserverFromList(Observer foo);
	public void notifyObservers();
}
