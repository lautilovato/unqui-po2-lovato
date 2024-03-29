package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTestCase {
	private Counter counter;
	
	@BeforeEach
	public void setUp() throws Exception { 
		
		counter = new Counter();
		
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(11);
		counter.addNumber(13);
		counter.addNumber(15);
		counter.addNumber(17);
		counter.addNumber(10);
	}
	
	@Test
	public void testEvenNumbers() {
		int amount = counter.oddNumbers();
		
		assertEquals(amount, 9);
		
	}
	
	@Test
	public void testHigherNumberXY() {
		int number = counter.higherNumberXY(3,9);
		
		assertEquals(number, 999);
		
	}

}
