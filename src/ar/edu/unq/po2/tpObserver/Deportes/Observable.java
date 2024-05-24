package ar.edu.unq.po2.tpObserver.Deportes;

import java.util.ArrayList;
import java.util.List;


abstract class Observable {

	private List<Observer> observers = new ArrayList<Observer>();
	
	public Observable() {
		
	}
	
	public List<Observer> getObservers() {
		return observers;
	}
	
	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}
	
	public void addObserver(Observer observer) {
		observers.add(observer);
	}
	
	public void deleteObserver(Observer observer) {
		observers.remove(observer);
	}

	
	public void advice() {
		for (Observer o:this.getObservers()) {
			o.update();
		}
	}

}
