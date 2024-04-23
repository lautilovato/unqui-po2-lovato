package ar.edu.unq.po2.tpSOLID;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class PersonalCreditTestCase {

	private Client client;
	private Client client2;
	private Bank bank;
	private PersonalCredit personalCredit;
	private PersonalCredit personalCredit2;
	
	@BeforeEach
	public void setUp() throws Exception { 
		
		client = new Client("lautaro", "lovato", "unq", 21, 3023.77 , 367.25);
		client2 = new Client("lautaro", "lovato", "unq", 21, 600 , 367.25);
		bank = new Bank(500000);
		personalCredit = new PersonalCredit(client, 20000, 12);
		personalCredit2 = new PersonalCredit(client2, 6000, 12);
		
		client.applyForCredit(bank, personalCredit);
		client2.applyForCredit(bank, personalCredit2);
		
	}
	
	@Test
	void testBankContainsCredit() {
		 
		assertTrue(bank.getCredits().contains(personalCredit));
		
		
	}
	
	@Test
	void testCreditRequeriments() {
		 
		assertTrue(personalCredit.meetRequeriments());
		
	}
	
	@Test
	void testBankEvaluateCredit() {
		bank.evaluateCredit(personalCredit);
		assertEquals(bank.getMoneyBag(), 480000);
	}
	
	@Test
	void testBankEvaluateCredits() {
		bank.evaluateCreditsApplication();
		assertEquals(bank.getMoneyBag(), 480000);
		assertEquals(client.getMoneyBag(), 20367.25);
		assertFalse(bank.getCredits().contains(personalCredit));	
	}
 
	@Test
	void testBankEvaluateCreditsDenegated() {
		bank.evaluateCreditsApplication();
		assertEquals(bank.getMoneyBag(), 480000);
		assertEquals(client.getMoneyBag(), 20367.25);
		assertEquals(client2.getMoneyBag(), 367.25);
		
	}
	
}
