package com.srj.mastermind.game;

import java.awt.Graphics2D;
import java.awt.event.MouseEvent;

import com.srj.mastermind.C;
import com.srj.mastermind.game.MastermindGame.GAME_TYPES;
import com.srj.mastermind.game.entity.Entity;

public class Solution extends Entity {
	
	private Piece[] solution;	

	public Solution(MastermindGame.GAME_TYPES type) {
		super(C.ZERO, C.ZERO, C.ZERO, C.ZERO);
		if (type == MastermindGame.GAME_TYPES.standard) {
			createStandardSolution();
		}
	}

	private void createStandardSolution() {
		solution = new Piece[C.STANDARD_SOLUTION_SIZE];
		
		for (int i = 0; i < C.STANDARD_SOLUTION_SIZE; i++) {
			solution[i] = new Piece(GAME_TYPES.standard, true, C.ZERO, C.ZERO);
		}
		
	}

	@Override
	public void render(Graphics2D g) {
		
	}

	@Override
	public void handleClick(MouseEvent e) {
		// never needed for the solution block
	}
}
