package ar.edu.unq.po2.tpTemplateMethodYAdapter.ej5;
import java.util.*;

abstract class BankAccount {
	private String owner; 
	private double balance;
	private List<String> movements;
	
	
	public BankAccount(String owner) {
		this.owner = owner;
		this.balance = 0;
		this.movements = new ArrayList<String>();
	}

	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getOwner() {
		return owner;
	}

	public List<String> getMovements() {
		return movements;
	}
	
	public void addMovement(String movement){
		this.movements.add(movement);
	}
	
	public void extract(double amount) {
		if(this.verify(amount)) {
			this.setBalance(this.getBalance() - amount);
			this.addMovement("Extraction");
		}
	}
	
	public abstract boolean verify(double amoount);
}
