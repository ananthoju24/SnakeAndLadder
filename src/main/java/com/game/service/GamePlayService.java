package com.game.service;

import com.game.Board;
import com.game.Player;

public interface GamePlayService {

	int rollDice();

	boolean isValidPosition(int nextPosition);

	boolean isWinner(int nextPosition);

	void movePlayer(Board board, Player player, int nextPostion);

}