package ar.edu.unq.po2.tpTemplateMethodYAdapter.ej5;


public class CurrentAccount extends BankAccount{

	private double discovered;
	
	public CurrentAccount(String owner, double discovered) {
		
		super(owner);
		this.discovered = discovered;
	}

	public double getDiscovered() {
		return discovered;
	}
	
	public boolean verify(double amount) {
		
		return this.getBalance() + this.getDiscovered() >= amount; 
	}

	
	
	
	
	
}
