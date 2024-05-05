package ar.edu.unq.po2.tpTestDoubles;

import java.util.*;
import java.util.stream.Collectors;


public class PokerStatus {

	
	public PokerStatus() {
		
	}
	
	public boolean verify(Card card1, Card card2, Card card3, Card card4, Card card5) {
		
		List<Card> cards = Arrays.asList(card1, card2, card3, card4, card5);
		
		return cards.stream()
				   .collect(Collectors.groupingBy(card -> card.getValue(), Collectors.counting()))
				   .values().stream()
				   .anyMatch(count -> count == 4);
		
	}
	
}


