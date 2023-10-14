package com.week6;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

	//List<Card> cards = new ArrayList<Card> ();
	//can choose not to instantiate
	private ArrayList<Card> deck; //should've been called cards
	
	//In the constructor, when a new Deck is instantiated, the Cards field should be
	//populated with the standard 52 cards.
	Deck() {

		String[] suits  = {"Diamonds", "Hearts", "Clubs", "Spades"};
		String[] faces = {"Jack", "Queen", "King", "Ace"};
		
		deck = new ArrayList<> ();
		
		for (String suit : suits) {
			for (int index = 2; index < 15; index++) {
				if (index <= 10) {
					deck.add(new Card(index,index+ " of " + suit));
				}else {
					deck.add(new Card(index,faces[index-11] + " of " + suit));
					}
				}
			}
//		System.out.println("test end"); //debugged here to see the contents of the deck on creation
	}
	

//		public void shuffle() {
//		    Collections.shuffle(this.cards); 
//		}
	//this method randomizes the order of the cards
	public void shuffle() {
		Collections.shuffle(this.deck);
//		System.out.println("test end"); debugging breakpoint for checking contents after shuffle
	}
	
	//this removes and returns the top card of the cards field 
	public Card draw() {
		if (!deck.isEmpty()) 
			 return deck.remove(0);
		else 
			//change to exception, was return null
			throw new RuntimeException("Cannot draw from an empty deck");
					
	}

	// did not do setters and getters, wasn't requested and wasn't going to use them in the program
}
