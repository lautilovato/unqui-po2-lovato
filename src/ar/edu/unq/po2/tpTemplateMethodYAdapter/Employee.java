package ar.edu.unq.po2.tpTemplateMethodYAdapter;

abstract class Employee {
	
	private int hoursWorked;

	public Employee(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	
	protected double  salary() {
		
		double grossSalary = this.grossSalary(); 
		double discounts = this.discounts(grossSalary);
		
		return grossSalary - discounts;
	}
	
	protected abstract double grossSalary();
		
	
	protected double discounts(double grossSalary) {
		return (grossSalary * 0.13);
	}
	
	public int getHoursWorked() {
		return hoursWorked;
	}
}


	