package ar.edu.unq.po2.tp5;
import java.util.ArrayList;
import java.util.List;


public class CashRegister implements Agency{
	
	private List<Product> products = new ArrayList<Product>();
	private CollectionAgency collectionAgency;
	
	public CashRegister(CollectionAgency collectionAgency) {
		this.collectionAgency = collectionAgency;
	}
	
	public CollectionAgency getCollectionAgency() {
		return collectionAgency;
	}
	
	public List<Product> getProducts(){
		return products;
	}
	
	public void registerPrduct(Product product) {
		products.add(product);
		product.removeStock();
	}
	
	public double amountPayable() {
		double amount = 0;
		for (Product p:this.getProducts()){
			amount = amount + p.getPrice();
		}
		return amount;
	}
	
	public void payReceipt(Receipt receipt) {
		this.registerPayment(receipt);
	}
	
	public void registerPayment(Receipt receipt) {
		this.getCollectionAgency().registerPayment(receipt);
	}
}
