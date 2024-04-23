package ar.edu.unq.po2.tpSOLID;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MortgageCreditTestCase {

	private Client client;
	private Client client2;
	private Bank bank;
	private MortgageCredit mortgageCredit;
	private MortgageCredit mortgageCredit2;
	private Property property;
	
	@BeforeEach
	public void setUp() throws Exception { 
		
		client = new Client("lautaro", "lovato", "unq", 21, 3023.77 , 367.25);
		client2 = new Client("lautaro", "lovato", "unq", 30, 600 , 367.25);
		bank = new Bank(500000);
		property = new Property("unq", 150000);
		mortgageCredit = new MortgageCredit(client, 10000, 12, property);
		mortgageCredit2 = new MortgageCredit(client2, 200000, 12, property);
		
		client.applyForCredit(bank, mortgageCredit);
		client2.applyForCredit(bank, mortgageCredit2);
		
	}
	
	@Test
	void testBankContainsCredit() {
		 
		assertTrue(bank.getCredits().contains(mortgageCredit));
		assertTrue(bank.getCredits().contains(mortgageCredit2));
	}
	
	@Test
	void testCreditRequeriments() {
		 
		assertTrue(mortgageCredit.meetRequeriments());
		
	}
	
	@Test
	void testBankEvaluateCredit() {
		bank.evaluateCredit(mortgageCredit);
		assertEquals(bank.getMoneyBag(), 490000);
	}
	
	@Test
	void testBankEvaluateCredits() {
		bank.evaluateCreditsApplication();
		assertEquals(bank.getMoneyBag(), 490000);
		assertEquals(client.getMoneyBag(), 10367.25);
		assertEquals(client2.getMoneyBag(), 367.25);
		assertFalse(bank.getCredits().contains(mortgageCredit));
		assertFalse(bank.getCredits().contains(mortgageCredit2));
	}
 

}
