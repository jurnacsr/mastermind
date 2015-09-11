package com.srj.mastermind.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import com.srj.mastermind.game.MastermindGame;

public class MastermindPanel extends JPanel{
	
	private MastermindGame game;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		render(g);
	}

	private void render(Graphics g) {
	}

	public void setGame(MastermindGame g) {
		this.game = g;
		
	}

}
