package ar.edu.unq.po2.tpSOLID;

public class MortgageCredit implements Credit{
	
	Client client;
	double amount;
	int months;
	Property property;
	
	public MortgageCredit(Client client, double amount, int months, Property property) {
		
		this.client = client;
		this.amount = amount;
		this.months = months;
		this.property = property;
	}
	
	public Client getClient() {
		return client;
	}

	public double getAmount() {
		return amount;
	}

	public int getMonths() {
		return months;
	}
	
	public Property getProperty() {
		return property;
	}

	public double getMonthlyFee() {
		return this.getAmount() / this.getMonths();
	}
	
	public boolean meetRequeriments() {
		boolean state = false;
		if( this.getProperty().getFiscalValue() * 0.70 > this.getAmount() && 
			this.getClient().getMonthlyNetSalary() * 0.50 > this.getMonthlyFee() &&
			this.getClient().getAge() + this.getMonths() / 12 < 65) {
			
			state = true;
		}
		return state;
	}
}
