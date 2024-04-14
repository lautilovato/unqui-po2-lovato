package ar.edu.unq.po2.tp5;

public class CompanyProduct implements Product {
	private String name;
	private double price;
	
	public CompanyProduct() {
		
	}
	
	public CompanyProduct(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
}
