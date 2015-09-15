package com.srj.mastermind.game;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import com.srj.mastermind.C;
import com.srj.mastermind.game.entity.Entity;

public class MastermindGame extends Entity {
	
	public static enum GAME_TYPES {
		standard
	}
	
	private GameBoard board;
	private Solution solution;
	private PiecePicker picker;
	
	private List<Entity> entityList;

	public MastermindGame(int x, int y, int width, int height) {
		super(x, y, width, height);
		
		// create empty game board
		board = new GameBoard(C.ZERO, C.ZERO, C.BOARD_WIDTH, C.BOARD_HEIGHT);
		
		// generate solution
		solution = new Solution(MastermindGame.GAME_TYPES.standard);
		board.setSolution(solution);
		
		// create the piece picker entity
		picker = new PiecePicker(C.ZERO, C.PIECE_PICKER_LOC, C.PIECE_PICKER_WIDTH, C.PIECE_PICKER_HEIGHT);
		
		entityList = new ArrayList<Entity>();
		entityList.add(board);
		entityList.add(picker);
	}

	@Override
	public void render(Graphics2D g) {
		
		// handle update
		update();
		
		// draw board background
		g.setColor(Color.black);
		g.fillRect(C.ZERO, C.BOARD_BOTTOM_LINE_POS, C.BOARD_BOTTOM_LINE_END, C.BOARD_BOTTOM_LINE_SIZE);
		g.fillRect(C.BOARD_SIDE_LINE_POS, C.ZERO, C.BOARD_SIDE_LINE_SIZE, C.BOARD_SIDE_LINE_END);
		
	}
	
	private void update() {
		
	}

	@Override
	public void handleClick(MouseEvent e) {
		for (Entity ee: entityList) {
			ee.handleClick(e);
		}
	}
}
