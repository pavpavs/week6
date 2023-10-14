package com.week6;

public class Card {

		//fields
		//requested: value and name. made them more descriptive with cardValue and cardName
		
		private int cardValue;
		private String cardName;
		
		//overloading (?) default constructor
		
		Card (int setCardValue, String setCardName){
			if (setCardValue < 2 || setCardValue >14 ) {
				//comment on this
				throw new IllegalArgumentException("Card value must be between 2 and 14");
			}else {
			cardValue = setCardValue;
			cardName = setCardName;
			}
		}
		
		//getters and setters
		
		public int getCardValue() {
			return cardValue;
		}
		public void setCardValue(int cardValue) {
			this.cardValue = cardValue;
		}
		public String getCardName() {
			return cardName;
		}
		public void setCardName(String cardName) {
			this.cardName = cardName;
		}
		
		//describe()
		
		public void describeCard() {
			System.out.println("This card's value is: "+ cardValue);
			System.out.println("This card's name is: "+ cardName);
		}
	
	
}
