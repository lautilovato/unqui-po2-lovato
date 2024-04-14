package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CashRegsiterTestCase {

	private CashRegister cashRegister;
	private CompanyProduct product1;
	private CooperativeProduct product2;
	
	@BeforeEach
	public void setUp() throws Exception { 
		
		cashRegister = new CashRegister();
		product1 = new CompanyProduct("cookies", 30,3);
		product2 = new CooperativeProduct("pan", 10.5,10);
		
		cashRegister.registerPrduct(product1);
		cashRegister.registerPrduct(product2);

	}
	
	@Test
	void testCashRegitser() {
		double amountPayable = cashRegister.amountPayable();
		assertEquals(amountPayable, 39.45);
		assertEquals(product1.getStock(),2); 
		assertEquals(product2.getStock(),9); 
	}

}
