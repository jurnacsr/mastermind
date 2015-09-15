package com.srj.mastermind.input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import com.srj.mastermind.game.MastermindGame;

public class InputHandler implements MouseListener {

	private MastermindGame game;

	public InputHandler(MastermindGame game) {
		this.game = game;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e.getX() + ", " + e.getY());
		game.handleClick(e);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

}
