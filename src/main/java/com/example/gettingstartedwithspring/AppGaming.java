package com.example.gettingstartedwithspring;

public class AppGaming {
	
	public static void main(String[] args) {
		
		MarioGame game = new MarioGame();
		GameRunner gameRunner = new GameRunner(game);
		gameRunner.run();
		
	}

}
