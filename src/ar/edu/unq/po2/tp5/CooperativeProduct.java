package ar.edu.unq.po2.tp5;

public class CooperativeProduct implements Product {
	private String name;
	private double price;
	private int stock;
	
	public CooperativeProduct() {
		
	}
	
	public CooperativeProduct(String name, double price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}

	public double getPrice() {
		return price * 0.9;
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
