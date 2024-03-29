package ar.edu.unq.po2.tp3;
import java.util.List;
import java.util.ArrayList;

public class Counter {
	
	private List<Integer> numbersList = new ArrayList<Integer>();
	
	public Counter(){
		
	}
	
	
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
	
	/* funcion ej 3 */
	
	public int higherNumberXY(int x,int y) {
		int number = -1;
		for(int i = 0; i<1001; i++) {
			if(i % x == 0 && i % y == 0){
				number = i;
			}
		}
		return number;
	}
	
	
}





