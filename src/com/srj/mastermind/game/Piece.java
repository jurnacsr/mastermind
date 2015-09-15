package com.srj.mastermind.game;

import java.awt.Graphics2D;
import java.awt.event.MouseEvent;

import com.srj.mastermind.C;
import com.srj.mastermind.game.MastermindGame.GAME_TYPES;
import com.srj.mastermind.game.entity.Entity;

public class Piece extends Entity {

	public enum PIECE_STATE  {
			none, black, white, red, green, blue, yellow
	}
	private PIECE_STATE piece;
	
	private int boardXLoc;
	private int boardYLoc;
	
	public Piece(GAME_TYPES type, boolean randomPiece, int x, int y) {
		super(x, y, C.PIECE_SIZE, C.PIECE_SIZE);
		if (randomPiece) {
			// TODO: Generate random piece - generate random solution
			this.piece = PIECE_STATE.black;
		} else {
			this.piece = PIECE_STATE.none;
		}
	}

	@Override
	public void render(Graphics2D g) {
		
	}

	@Override
	public void handleClick(MouseEvent e) {
	}
}
