package ar.edu.unq.po2.tpTemplateMethodYAdapter;

public class TemporaryEmployee extends Employee{
	
	private int hoursWorked;
	private boolean family;
	private final double basicSalary = 1000;
	private final double amountPerHour = 5;
	

	public TemporaryEmployee(int hoursWorked, boolean family) {
		
		this.hoursWorked = hoursWorked;
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
	
	public int getHoursWorked() {
		return hoursWorked;
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
