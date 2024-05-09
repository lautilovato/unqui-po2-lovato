package ar.edu.unq.po2.tpTemplateMethodYAdapter.ej5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CurrentAccountTestCase {

	CurrentAccount currentAccount;
	
	
	@BeforeEach
	public void setUp() throws Exception {
		
		currentAccount = new CurrentAccount("Lautaro", 1000);
	}
	
	@Test
	void testCorrectExtract() {
		
		currentAccount.setBalance(500);
		currentAccount.extract(200);
		
		assertEquals(currentAccount.getBalance(), 300);
		assertTrue(currentAccount.getMovements().contains("Extraction"));
	}
	
	@Test
	void testCorrectExtractNegativeBalance() {
		
		currentAccount.setBalance(500);
		currentAccount.extract(700);
		
		assertEquals(currentAccount.getBalance(), -200);
		assertTrue(currentAccount.getMovements().contains("Extraction"));
		
	}
	
	@Test
	void testFailExtract() {
		
		currentAccount.setBalance(500);
		currentAccount.extract(2000);
		
		assertEquals(currentAccount.getBalance(), 500);
		assertEquals(currentAccount.getMovements().size(), 0);
	}

}
