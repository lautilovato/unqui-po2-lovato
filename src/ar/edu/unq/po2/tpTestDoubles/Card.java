package ar.edu.unq.po2.tpTestDoubles;

public class Card {
	
	private String suit;
	private String value;

	public Card(String suit, String value){
		
		this.suit = suit;
		this.value = value;
	}

	public String getSuit() {
		return suit;
	}

	public String getValue() {
		return value;
	}

	public int getCardValue() {
		int cardValue = 0;
		
		if(this.getValue() == "2") {
			cardValue = 2;
		}
		else if(this.getValue() == "3") {
			cardValue = 3;
		}
		else if(this.getValue() == "4") {
			cardValue = 4;
		}
		else if(this.getValue() == "5") {
			cardValue = 5;
		}
		else if(this.getValue() == "6") {
			cardValue = 6;
		}
		else if(this.getValue() == "7") {
			cardValue = 7;
		}
		else if(this.getValue() == "8") {
			cardValue = 8;
		}
		else if(this.getValue() == "9") {
			cardValue = 9;
		}
		else if(this.getValue() == "10") {
			cardValue = 10;
		}
		else if(this.getValue() == "J") {
			cardValue = 11;
		}
		else if(this.getValue() == "Q") {
			cardValue = 12;
		}
		else if(this.getValue() =="K") {
			cardValue = 13;
		}
		else {
			cardValue = 14;
		}
		
		return cardValue;
	}
	
	
	
}


