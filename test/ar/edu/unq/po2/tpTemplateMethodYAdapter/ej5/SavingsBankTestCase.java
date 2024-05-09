package ar.edu.unq.po2.tpTemplateMethodYAdapter.ej5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SavingsBankTestCase {

	SavingsBank savingsBank;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		savingsBank = new SavingsBank("Lautaro", 1000);
	}
	
	@Test
	void testCorrectExtract() {
		savingsBank.setBalance(500);
		savingsBank.extract(300);
		
		assertEquals(savingsBank.getBalance(), 200);
		assertTrue(savingsBank.getMovements().contains("Extraction"));
	}
	
	@Test
	void testExtractForLimit() {
		savingsBank.setBalance(2000);
		savingsBank.extract(1500);
		
		assertEquals(savingsBank.getBalance(), 2000);
		assertEquals(savingsBank.getMovements().size(), 0);
	}
	
	@Test
	void testExtractForBalance() {
		savingsBank.setBalance(500);
		savingsBank.extract(700);
		
		assertEquals(savingsBank.getBalance(), 500);
		assertEquals(savingsBank.getMovements().size(), 0);
	}

}
