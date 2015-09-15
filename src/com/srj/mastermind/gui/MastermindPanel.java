package com.srj.mastermind.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import com.srj.mastermind.game.MastermindGame;
import com.srj.mastermind.input.InputHandler;

public class MastermindPanel extends JPanel{
	
	private MastermindGame game;
	private InputHandler input;
	
	public MastermindPanel(MastermindGame g) {
		super();
		
		this.game = g;
		input = new InputHandler(game);
		this.addMouseListener(input);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		render(g);
	}

	private void render(Graphics g) {
		Graphics2D gg = (Graphics2D)g;
		this.game.render(gg);
		
	}

	public void setGame(MastermindGame g) {
		this.game = g;
		
	}

}
