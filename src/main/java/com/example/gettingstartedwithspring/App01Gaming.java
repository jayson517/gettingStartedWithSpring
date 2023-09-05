package com.example.gettingstartedwithspring;

import com.example.gettingstartedwithspring.game.GameRunner;
import com.example.gettingstartedwithspring.game.MarioGame;
import com.example.gettingstartedwithspring.game.PacmanGame;

public class App01Gaming {
	
	public static void main(String[] args) {
		
		MarioGame game = new MarioGame();
		PacmanGame pgame = new PacmanGame();
		GameRunner gameRunner = new GameRunner(pgame);
		gameRunner.run();
		
	}

}
