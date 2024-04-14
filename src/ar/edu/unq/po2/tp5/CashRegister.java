package ar.edu.unq.po2.tp5;
import java.util.ArrayList;
import java.util.List;


public class CashRegister {
	List<Product> products = new ArrayList<Product>();
	
	public CashRegister() {
		
	}
	
	public void registerPrduct(Product product) {
		products.add(product);
		product.removeStock();
	}
	
	public List<Product> getProducts(){
		return products;
	}
	
	public double amountPayable() {
		double amount = 0;
		for (Product p:this.getProducts()){
			amount = amount + p.getPrice();
		}
		return amount;
	}
}
