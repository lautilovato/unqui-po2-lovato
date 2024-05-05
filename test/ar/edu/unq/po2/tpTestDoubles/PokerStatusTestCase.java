package ar.edu.unq.po2.tpTestDoubles;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTestCase {

	private PokerStatus ps; // SUT
	private Card card1; // DOCS
	private Card card2;
	private Card card3;
	private Card card4;
	private Card card5;
	private Card card6;
	

	@BeforeEach
	public void setUp() throws Exception {
		
		ps = new PokerStatus();

		card1 = mock(Card.class);
		card2 = mock(Card.class);
		card3 = mock(Card.class);
		card4 = mock(Card.class);
		card5 = mock(Card.class);
	}

	
	@Test
	void testWithIsPoker() {
		
		when(card1.getSuit()).thenReturn("D");
		when(card1.getSuit()).thenReturn("T");
		when(card1.getSuit()).thenReturn("P");
		when(card1.getSuit()).thenReturn("C");
		when(card1.getSuit()).thenReturn("D");
		
		when(card1.getValue()).thenReturn("4");
		when(card2.getValue()).thenReturn("4");
		when(card3.getValue()).thenReturn("4");
		when(card4.getValue()).thenReturn("4");
		when(card5.getValue()).thenReturn("10");
		
		assertTrue(ps.verify(card1, card2, card3, card4, card5));
	}

}
