package ar.edu.unq.po2.tpTemplateMethodYAdapter.ej2;

public class PlantEmployee extends Employee{
	
	private final double basicSalary = 3000;
	private int childrens;
	
	public PlantEmployee(int childrens) {
		
		this.childrens = childrens;
	}

	public double grossSalary() {
		return this.getBasicSalary() + this.getAmountPerChildrens();
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public int getChildrens() {
		return childrens;
	}
	
	public double getAmountPerChildrens() {
		return this.getChildrens() * 150;
	}
	
}
