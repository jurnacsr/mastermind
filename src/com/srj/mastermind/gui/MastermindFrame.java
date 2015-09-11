package com.srj.mastermind.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import com.srj.mastermind.C;
import com.srj.mastermind.game.MastermindGame;

public class MastermindFrame extends JFrame {
	
	private MastermindFrame instance;
	private MastermindPanel panel;
	private MastermindGame  game;
	
	public MastermindFrame() {
		
		instance = this;
		
		initUI();
		initMenu();
		
		panel = new MastermindPanel();
		panel.setGame(game);
		add(panel);
		
		setVisible(true);
	}

	private void initMenu() {
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu menu = new JMenu("Options");
		menu.setMnemonic(KeyEvent.VK_M);
		
		JMenuItem exitOption = new JMenuItem("Exit");
		exitOption.setMnemonic(KeyEvent.VK_E);
		exitOption.setToolTipText("Exit the game");
		exitOption.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				instance.dispatchEvent(new WindowEvent(instance, WindowEvent.WINDOW_CLOSING));
			}
		});
		
		menu.add(exitOption);
		menuBar.add(menu);
		setJMenuBar(menuBar);
		
	}

	private void initUI() {
		
		setTitle("Mastermind");
		setSize(C.WINDOW_WIDTH, C.WINDOW_HEIGHT);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}
