package com.srj.mastermind.game;

import java.awt.Graphics2D;
import java.awt.event.MouseEvent;

import com.srj.mastermind.game.entity.Entity;

public class PiecePicker extends Entity{

	public PiecePicker(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void render(Graphics2D g) {
		
	}

	@Override
	public void handleClick(MouseEvent e) {
		if (isClickWithin(e)) {
			System.out.println("click in picker");
		}
	}

}
