package ar.edu.unq.po2.tpTemplateMethodYAdapter;

public class PassantEmployee extends Employee{
	
	private final double amountPerHour = 40;
	private int hoursWorked;
	
	public PassantEmployee(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	public double getAmountPerHour() {
		return amountPerHour;
	}
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	
	public double grossSalary() {
		return this.getAmountPerHour() * this.getHoursWorked();
	}
}
