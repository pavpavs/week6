package com.week6;

import java.util.ArrayList;

public class Player {

	//similar to Deck()
	private ArrayList<Card> playerHand;
	private int playerScore;
	private String playerName;
	
	//set score to zero in constructor
	Player (String playerName){
		this.setPlayerScore(0);
		this.setPlayerName(playerName);
		this.playerHand = new ArrayList<> ();
	}

	//getters and setters
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerScore() {
		return playerScore;
	}

	public void setPlayerScore(int playerScore) {
		this.playerScore = playerScore;
	}
	
	//describe
	public void describePlayer() {
		System.out.println("Player " + playerName + "'s score is: " + playerScore + " and their hand is: ");
		for (Card handCard : playerHand) {
			handCard.describeCard();
		}
	}
	//flip
	public Card flip() {
		if (!playerHand.isEmpty())
			return playerHand.remove(0);
		else 
			throw new RuntimeException("Cannot flip from an empty hand");
	}
	
	//increment
	public void incrementScore() {
		playerScore++;
	}
	
//	draw (takes a Deck as an argument and calls the draw method on the deck,
//			adding the returned Card to the hand field)
	
	public void draw(Deck deck) {
		playerHand.add(deck.draw());
	}
	
}
