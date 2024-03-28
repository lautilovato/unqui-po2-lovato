package ar.edu.unq.po2.tp3;

import java.util.List;
import java.util.ArrayList;

public class Counter {
	
	public Counter(){
	
	}
	
	private List<Integer> numbersList = new ArrayList<Integer>();
	
	public void addNumber(int number) {
		numbersList.add(number);
	}
	
	public List<Integer> getNumbersList() {
		return numbersList;
	}
	
	public List<Integer> pairNumbers(){
		List<Integer> numbers = this.getNumbersList();
		List<Integer> newNumbers = new ArrayList<Integer>();
		for(int number:numbers) {
			if(number % 2 == 0 ) {
				newNumbers.add(number);
			}
		}
		return newNumbers;
	}
	
	public int oddNumbers(){
		List<Integer> numbers = this.getNumbersList();
		List<Integer> newNumbers = new ArrayList<Integer>();
		for(int number:numbers) {
			if(number % 2 != 0 ) {
				newNumbers.add(number);
			}
		}
		return newNumbers.size();
	}

	public int multiplesOfX(int x) {
		List<Integer> numbers = this.getNumbersList();
		List<Integer> newNumbers = new ArrayList<Integer>();
		for(int number:numbers) {
			if(number % x == 0 ) {
				newNumbers.add(number);
			}
		}
		return newNumbers.size();
	}
	
}
