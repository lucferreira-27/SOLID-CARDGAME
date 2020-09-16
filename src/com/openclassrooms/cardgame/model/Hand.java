package com.openclassrooms.cardgame.model;

import java.util.ArrayList;

public class Hand {
	ArrayList<PlayingCard> cards;
	public Hand() {
		// TODO Auto-generated constructor stub
		cards = new ArrayList<PlayingCard>();
	}
	
	public PlayingCard removeCard() {
		return cards.remove(0);
	}	
	
	public PlayingCard getCard(int index) {
		return cards.get(index);
	}
	
	public void addCard(PlayingCard pc) {
		cards.add(pc);
	}
}
