package com.game;

public class Board {

	int board[][];

	public int[][] get() {
		board = new int[10][10];
		return board;
	}

	public void fill() {
		if (board == null) {
			return;
		}
		int counter = 1;
		for (int i = 0; i < 10; i++) {
			if (i != 0)
				counter += 10;
			for (int j = 0; j < 10; j++) {
				if (i % 2 == 0) {
					board[i][j] = counter++;
				} else {
					board[i][j] = counter--; // need the double value
				}

			}
		}
	}

	public void print() {
		
		for (int i = 0; i < 10; i++) {
			System.out.print("| ");
			for (int j = 0; j < 10; j++) {
				System.out.print(board[i][j] + " |");
			}
			System.out.println();
		}
		
		
	}
}
