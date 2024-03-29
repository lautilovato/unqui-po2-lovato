package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {
	
	private List<Integer> numbersList = new ArrayList<Integer>();
	
	public Multioperador() {
		
	}
	
	public List<Integer> getNumbersList() {
		return numbersList;
	}
	
	public void addNumber(int number) {
		numbersList.add(number);
	}
	
	public int  applySum(){
		int result = 0;
		List<Integer> numbers = this.getNumbersList();
		for(int number:numbers) {
			result = result + number;
		}
		return result;
	}


}
