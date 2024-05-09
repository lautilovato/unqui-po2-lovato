package ar.edu.unq.po2.tpTemplateMethodYAdapter.ej5;

public class SavingsBank extends BankAccount{
	
	private double limit;
	
	public SavingsBank(String owner, double limit) {
		super(owner);
		this.limit = limit;
	}

	public double getLimit() {
		return limit;
	}
	
	public boolean verify(double amount) {
		return (this.getBalance() >= amount) && (this.getLimit() >= amount);
	}
	

}

