package ar.edu.unq.po2.tp5;

public class CompanyProduct implements Product {
	private String name;
	private double price;
	private int stock;
	
	public CompanyProduct() {
		
	}
	
	public CompanyProduct(String name, double price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void removeStock() {
		stock = stock - 1;
	}
}
