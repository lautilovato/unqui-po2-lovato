package ar.edu.unq.po2.tpTestDoubles;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PokerStatusTestCase {

	private PokerStatus ps; // SUT
	private Card card1; // DOCS
	private Card card2;
	private Card card3;
	private Card card4;
	private Card card5;
	

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
		when(card2.getSuit()).thenReturn("T");
		when(card3.getSuit()).thenReturn("P");
		when(card4.getSuit()).thenReturn("C");
		when(card5.getSuit()).thenReturn("D");
		
		when(card1.getValue()).thenReturn("4");
		when(card2.getValue()).thenReturn("4");
		when(card3.getValue()).thenReturn("4");
		when(card4.getValue()).thenReturn("4");
		when(card5.getValue()).thenReturn("10");
		
		String result = ps.verify(card1, card2, card3, card4, card5);
		
		verify(card1).getValue();
		verify(card2).getValue();
		verify(card3).getValue();
		verify(card4).getValue();
		verify(card5).getValue();
		
		assertEquals(result, "POKER");
	}
	
	@Test
	void testWithIsColor() {
		
		when(card1.getSuit()).thenReturn("D");
		when(card2.getSuit()).thenReturn("D");
		when(card3.getSuit()).thenReturn("D");
		when(card4.getSuit()).thenReturn("D");
		when(card5.getSuit()).thenReturn("D");
		
		when(card1.getValue()).thenReturn("4");
		when(card2.getValue()).thenReturn("5");
		when(card3.getValue()).thenReturn("10");
		when(card4.getValue()).thenReturn("K");
		when(card5.getValue()).thenReturn("9");
		
		String result = ps.verify(card1, card2, card3, card4, card5);
		
		verify(card1).getSuit();
		verify(card2).getSuit();
		verify(card3).getSuit();
		verify(card4).getSuit();
		verify(card5).getSuit();
		
		assertEquals(result, "COLOR");
	}
	
	@Test
	void testWithIsTrio() {
		
		when(card1.getSuit()).thenReturn("D");
		when(card2.getSuit()).thenReturn("P");
		when(card3.getSuit()).thenReturn("D");
		when(card4.getSuit()).thenReturn("C");
		when(card5.getSuit()).thenReturn("D");
		
		when(card1.getValue()).thenReturn("5");
		when(card2.getValue()).thenReturn("5");
		when(card3.getValue()).thenReturn("10");
		when(card4.getValue()).thenReturn("5");
		when(card5.getValue()).thenReturn("9");
		
		String result = ps.verify(card1, card2, card3, card4, card5);
		
		verify(card1, times(2)).getValue();
		verify(card2, times(2)).getValue();
		verify(card3, times(2)).getValue();
		verify(card4, times(2)).getValue();
		verify(card5, times(2)).getValue();
		
		assertEquals(result, "TRIO");
	}

	@Test
	void testMajorCard() {
		
		Card cardX= new Card("D", "K");
		Card cardY= new Card("D", "A");
		
		boolean result = ps.isOlder(cardY, cardX);
		
		assertTrue(result);
	}
	
	@Test
	void testSameSuit() {
		
		Card cardX= new Card("D", "K");
		Card cardY= new Card("D", "A");
		
		boolean result = ps.itsSameSuit(cardY, cardX);
		
		assertTrue(result);
	}
	

}
