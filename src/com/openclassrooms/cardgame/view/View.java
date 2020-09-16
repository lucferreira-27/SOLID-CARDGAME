package com.openclassrooms.cardgame.view;

import java.util.Scanner;

import com.openclassrooms.cardgame.controller.GameController;

public class View {
	
	GameController controller;
	Scanner keyboard = new Scanner(System.in);
	
	public void setController(GameController controller) {
		this.controller = controller;
	};
	public void promptForPlayerName() {
		System.out.println("Enter Player Name:");
		String name = keyboard.nextLine();
		if(name.isEmpty()) {
			controller.startGame();
		}else {
			controller.addPlayer(name);
		}
	}
	public void promptForFlip() {
		System.out.println("Press enter to reveal cards");
		keyboard.nextLine();
		controller.flipCards();
		
	}
	public void promptForNewGame() {
		System.out.println("Press enter to deal again");
		keyboard.nextLine();
		controller.startGame();
		
	}
	public void showPlayerName(int playeIndex, String playerName) {
		System.out.println("[" + playeIndex + "][" + playerName + "]");
	}
	public void showFaceDownCardForPlayer(int playerIndex, String playerName) {
		System.out.println("[" + playerName + "][][]");
	}
	public void showCardForPlayer(int playerIndex, String playerName, String rank, String suit) {
		System.out.println("[" + playerName + "][" + rank + "][" + suit +"]");
	}
	public void showWinner(String winnerName) {
		System.out.println("The winner is " + winnerName);
	}
}
