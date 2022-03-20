package com.game.service;

import java.util.Random;
import java.util.Scanner;

import com.game.Board;
import com.game.Player;

public class GamePlay implements GamePlayService {

	public static void main(String[] args) {

		GamePlay gPlay = new GamePlay();

		gPlay.startGame();
	}

	public void startGame() {

		Scanner sc = new Scanner(System.in);
		int [][] gameBoard ;
		System.out.println("Please enter start to start the game ");
		String value = sc.next();
		Board board = null;
		if("start".equalsIgnoreCase(value)) {
			board = new Board();
			gameBoard =  board.get();
			board.fill();
			board.print();
		} else {
			System.exit(0);
		}
		
		
		System.out.println("Please enter Player1 name ");
		value = sc.next();

		Player player1 = new Player(value, -1, -1, -1, true);
		System.out.println("Please enter Player2 name ");
		value = sc.next();
		Player player2 = new Player(value, -1, -1, -1, true);
		boolean currentTurn = true;
		while (player1.getCurrPostion() != 100 || player2.getCurrPostion() != 100) {

			if (currentTurn) {
				System.out.println(player1.getName() + ", please enter to roll dice");
				sc.next();
				int diceValue = rollDice();
				System.out.println("Dice value " + diceValue);
				int nextPosition = player1.getCurrPostion()+diceValue;
				if(isWinner(nextPosition)) {
					System.out.println(player1.getName()+ " Winner ");
					break;
				}
				
				if(isValidPosition(nextPosition)) {
					movePlayer(board, player1, nextPosition);
				}
				
				currentTurn = false;
			} else {
			
			}

		}

	}

	@Override
	public int rollDice() {
		Random dice1 = new Random();
		int n1 = dice1.nextInt(6);
		Random dice2 = new Random();
		int n2 = dice2.nextInt(6);
		return n1 + n2;
	}

	@Override
	public boolean isValidPosition(int nextPosition) {
		return nextPosition < 100;
	}

	@Override
	public boolean isWinner(int nextPosition) {
		return nextPosition == 100;
	}

	@Override
	public void movePlayer(Board board, Player player, int nextPostion) {

		if (player.getCurrPostion() > nextPostion) {
			// move down
		} else {
			// move up
		}

	}

	private void moveDown(int row, int col, int nextPosition) {
		  int j = col;
		/*
		 * for(int i = row ; i >=0 ; i-- ) { for( ; j < )
		 * 
		 * 
		 * }
		 */
		 
	}

}
