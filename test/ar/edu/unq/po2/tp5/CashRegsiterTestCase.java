package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CashRegsiterTestCase {

	private CashRegister cashRegister;
	private CompanyProduct product1;
	private CooperativeProduct product2;
	private CollectionAgency collectionAgency;
	private Tax tax;
	private Service service;
	
	@BeforeEach
	public void setUp() throws Exception { 
		
		collectionAgency = new CollectionAgency("lala");
		cashRegister = new CashRegister(collectionAgency);
		product1 = new CompanyProduct("cookies", 30,3);
		product2 = new CooperativeProduct("pan", 10.5,10);
		tax = new Tax("light", 123);
		service = new Service("water", 20.32, 50);
		
		cashRegister.registerPrduct(product1);
		cashRegister.registerPrduct(product2);
	

	}
	
	@Test
	void testBuyProduct() {
		double amountPayable = cashRegister.amountPayable();
		assertEquals(amountPayable, 39.45);
		assertEquals(product1.getStock(),2); 
		assertEquals(product2.getStock(),9); 
	}
	
	@Test
	void testPayTax() {
		cashRegister.payReceipt(tax);
		double amountPayable = tax.getTotalSum();
		assertEquals(amountPayable, 123);
		assertEquals(collectionAgency.getPaymentsMade().size(),1); 
		assertEquals(collectionAgency.getPaymentsMade().contains(tax), true); 	
	}
	
	@Test
	void testPayService() {
		cashRegister.payReceipt(service);
		double amountPayable = service.getTotalSum();
		assertEquals(amountPayable, 1016);
		assertEquals(collectionAgency.getPaymentsMade().size(),1); 
		assertEquals(collectionAgency.getPaymentsMade().contains(service), true); 
		
	}

}
