package ar.edu.unq.po2.tp5;

public class Service implements Receipt{
	
	private String name;
	private double untiCost;
	private int unitsConsumed;
	
	public Service(String name, double unitCost, int unitsConsumed) {
		
		this.name = name;
		this.untiCost = unitCost;
		this.unitsConsumed = unitsConsumed;
	}

	public String getName() {
		return name;
	}

	public double getUntiCost() {
		return untiCost;
	}

	public int getUnitsConsumed() {
		return unitsConsumed;
	}

	public double getTotalSum() {
		return this.getUntiCost() * this.getUnitsConsumed();
	}
	
}
