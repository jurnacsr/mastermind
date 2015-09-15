package com.srj.mastermind.game.entity;

import java.awt.Graphics2D;
import java.awt.event.MouseEvent;

public abstract class Entity {
	
	// screen x, y position and size of this entity
	private int x, y;
	private int width, height;
	
	public Entity(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	// draw this entity
	public abstract void render(Graphics2D g);
	
	// handle a click within this entity
	public abstract void handleClick(MouseEvent e);
	
	public boolean isClickWithin(MouseEvent e) {
		return (e.getX() >= this.x && e.getX() <= this.x + this.width) && (e.getY() >= this.y && e.getY() <= this.y + this.height) ;
	}
}
