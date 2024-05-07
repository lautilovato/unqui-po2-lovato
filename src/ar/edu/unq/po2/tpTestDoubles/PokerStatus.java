package ar.edu.unq.po2.tpTestDoubles;

import java.util.*;
import java.util.stream.Collectors;


public class PokerStatus {

	
	public PokerStatus() {
		
	}
	
	public String verify(Card card1, Card card2, Card card3, Card card4, Card card5) {
		
		String result = "";
		
		List<Card> cards = Arrays.asList(card1, card2, card3, card4, card5);
		
		if(this.isPoker(cards)) {
			result = "POKER";
		}
		else if(this.isColor(cards)) {
			result = "COLOR";
		}
		else if (this.isTrio(cards)){
			result = "TRIO";
		}
		else {
			result = "NONE";
		}
		return result;
	}
	
	public boolean isPoker(List<Card> cards) {
		return cards.stream()
				   .collect(Collectors.groupingBy(card -> card.getValue(), Collectors.counting()))
				   .values().stream()
				   .anyMatch(count -> count == 4);
	}
	
	public boolean isTrio(List<Card> cards) {
		return cards.stream()
				   .collect(Collectors.groupingBy(card -> card.getValue(), Collectors.counting()))
				   .values().stream()
				   .anyMatch(count -> count == 3);
	}
	
	public boolean isColor(List<Card> cards) {
		return cards.stream()
				.map(card -> card.getSuit())
				.distinct()
				.count() == 1;
	}
	
	public boolean isOlder(Card card1, Card card2) {
		return card1.getCardValue() > card2.getCardValue();
	}
	
}


