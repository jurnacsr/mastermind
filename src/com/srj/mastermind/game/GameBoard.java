package com.srj.mastermind.game;

import java.awt.Graphics2D;
import java.awt.event.MouseEvent;

import com.srj.mastermind.game.entity.Entity;

public class GameBoard extends Entity {
	
	private Solution sol;

	public GameBoard(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void render(Graphics2D g) {
		
	}

	public void setSolution(Solution solution) {
		this.sol = solution;
	}

	@Override
	public void handleClick(MouseEvent e) {
		
	}
}
