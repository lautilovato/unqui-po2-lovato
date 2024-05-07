package ar.edu.unq.po2.tpTemplateMethodYAdapter;

public class TemporaryEmployee extends Employee{
	
	private boolean family;
	private final double basicSalary = 1000;
	private final double amountPerHour = 5;
	

	public TemporaryEmployee(int hoursWorked, boolean family) {
		
		super(hoursWorked);
		this.family = family;
	}

	public boolean getFamily() {
		return family;
	}
	
	public double getBasicSalary() {
		return basicSalary;
	}
	
	public double getAmountPerFamily() {
		double amount = 0;
		if(this.getFamily()) {
			amount = 100;
		}
		return amount;
	}
	
	
	public double getAmountPerHour() {
		return amountPerHour;
	}

	public double getAmountPerHoursWoked() {
		return this.getAmountPerHour() * this.getHoursWorked();
	}
	
	public double grossSalary() {
		return this.getBasicSalary() + this.getAmountPerFamily() + this.getAmountPerHoursWoked();
	}
}
