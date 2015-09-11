package com.srj.mastermind.runner;

import java.awt.EventQueue;

import com.srj.mastermind.gui.MastermindFrame;

public class MastermindRunner {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new MastermindFrame();
			}
		});
		
	}

}
