package com.week6;

public class App {

	public static void main(String[] args) {
		
//		early testing my Card class		
//		Card card1 = new Card(3, "Ace of Hearts");
//		Card card2 = new Card(2, "Spade of Diamonds");
//		
//		card1.describeCard();
//		card2.describeCard();
		
		//initiate a deck
		//initiate two players
		Deck testDeck = new Deck();
		Player player1 = new Player("Pavel R");
		Player player2 = new Player("Daniel C");
		
		//shuffle deck
		testDeck.shuffle();
		
		//alternate dealing each player a card until all cards in deck are dealt
		//use %2 to alternate between 2 players
		
		for (int index = 0; index < 52; index++) {
			if (index%2 == 0)
				player1.draw(testDeck);
			else 
				player2.draw(testDeck);
		}
		
		//the main game loop
		//for loop iterates 26 times (rounds) 
		for (int index = 0; index < 26; index++) {
			//each player flips the top card in their hand, the results are stored in player1Card and player2Card
			//to be compared
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			
			//comparing flipped cards and scoring appropriately
			if (player1Card.getCardValue() > player2Card.getCardValue()) {
				player1.incrementScore();
				System.out.println(player1.getPlayerName()+ " wins this round with " + player1Card.getCardName() 
				+ " against " + player2.getPlayerName()+ "'s " + player2Card.getCardName());
			} else if (player1Card.getCardValue() < player2Card.getCardValue()) {
				player2.incrementScore();
				System.out.println(player2.getPlayerName()+ " wins this round with " + player2Card.getCardName() 
				+ " against " + player1.getPlayerName()+ "'s " + player1Card.getCardName());
			} else {
				System.out.println(player1.getPlayerName()+ " has " + player1Card.getCardName() 
				+ " and " + player2.getPlayerName()+ " has " + player2Card.getCardName() + ". It's a tie!");
			}
			System.out.println(player1.getPlayerName()+"'s current score is : "+ player1.getPlayerScore());
			System.out.println(player2.getPlayerName()+"'s current score is : "+ player2.getPlayerScore() + "\n ");
		}
		
		//print final result
		System.out.println("Player " + player1.getPlayerName() + " has score " + player1.getPlayerScore() + " Player  "  + player2.getPlayerName() + " has score " + player2.getPlayerScore());
		
		if (player1.getPlayerScore()> player2.getPlayerScore()) {
			System.out.println(player1.getPlayerName()+ " wins!");
		}else if (player1.getPlayerScore()< player2.getPlayerScore()) {
			System.out.println(player2.getPlayerName()+ " wins!");
		}else {
			System.out.println("Oh shucks! It's a tie!");
		}
	}	
}
