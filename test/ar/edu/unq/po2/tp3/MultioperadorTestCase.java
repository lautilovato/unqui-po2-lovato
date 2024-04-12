package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTestCase {
	private Multioperador multioperador;
	
	@BeforeEach
	public void setUp() throws Exception { 
		
		multioperador = new Multioperador();
		
		multioperador.addNumber(1);
		multioperador.addNumber(3);
		multioperador.addNumber(5);
		multioperador.addNumber(7);
		multioperador.addNumber(9);
	}
	
	
	@Test
	void testSumNumbers() {
		int result = multioperador.applySum();
		assertEquals(result, 25);
	}
	
	@Test
	void testSubtractNumbers() {
		int result = multioperador.applySubtract();
		assertEquals(result, -25);
	}

	@Test
	void testMultiplicationNumbers() {
		int result = multioperador.applyMultiplication();
		assertEquals(result, 945);
	}
}
