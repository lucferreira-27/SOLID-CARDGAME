package com.openclassrooms.cardgame.model;

public enum Suit {
	DIAMONDS(1),
	HEARTS(2),
	SPADES(3),
	CLUBS(4);
	
	int suit;
	
	private Suit(int value) {
		// TODO Auto-generated constructor stub
		suit = value;
	}
	
	public int value() {
		return suit;
	}
}
