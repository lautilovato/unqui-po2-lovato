package ar.edu.unq.po2.tp5;

public class CooperativeProduct implements Product {
	private String name;
	private double price;
	
	public CooperativeProduct() {
		
	}
	
	public CooperativeProduct(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double getPrice() {
		return price * 0.9;
	}
	
	public String getName() {
		return name;
	}
}
