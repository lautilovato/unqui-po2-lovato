package ar.edu.unq.po2.tpSOLID;

public class PersonalCredit implements Credit{
	
	Client client;
	double amount;
	int months;
	
	public PersonalCredit(Client client, double amount, int months) {
		
		this.client = client;
		this.amount = amount;
		this.months = months;
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

	public double getMonthlyFee() {
		return this.getAmount() / this.getMonths();
	}
	
	public boolean meetRequeriments() {
		boolean state = false;
		if( this.getClient().getAnnualNetSalary() > 15000 && 
			this.getClient().getMonthlyNetSalary() * 0.70 > this.getMonthlyFee() ) {
			state = true;
		}
		return state;
	}
	
}
