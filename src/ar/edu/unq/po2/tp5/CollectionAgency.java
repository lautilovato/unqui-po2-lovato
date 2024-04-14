package ar.edu.unq.po2.tp5;

import java.util.ArrayList;
import java.util.List;



public class CollectionAgency implements Agency{
	
	private String name;
	private List<Receipt> paymentsMade = new ArrayList<Receipt>();
	

	public CollectionAgency(String name) {
		this.name = name;
	}
	
	public List<Receipt> getPaymentsMade() {
		return paymentsMade;
	}
	
	public String getName() {
		return name;
	}
	
	public void registerPayment(Receipt receipt) {
		paymentsMade.add(receipt);
	}

}
