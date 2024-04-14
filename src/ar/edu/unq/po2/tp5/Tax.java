package ar.edu.unq.po2.tp5;

public class Tax implements Receipt {
	
	// taza del servicio
	private String name;
	private double serviceCup;
	
	public Tax(String name, double serviceCup) {
		
		this.name = name;
		this.serviceCup = serviceCup;
	}

	public String getName() {
		return name;
	}

	public double getTotalSum() {
		return serviceCup;
	}
	
}
