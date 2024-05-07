package ar.edu.unq.po2.tpTemplateMethodYAdapter;

public class PassantEmployee extends Employee{
	
	private final double amountPerHour = 40;
	
	public PassantEmployee(int hoursWorked) {
		super(hoursWorked);
	}
	
	public double getAmountPerHour() {
		return amountPerHour;
	}
	
	public double grossSalary() {
		return this.getAmountPerHour() * this.getHoursWorked();
	}
}
