package com.example.gettingstartedwithspring;

public class SuperContraGame implements GameConsole{

	public void up() {
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("Go to tunnel");
	}
	
	public void left() {
		System.out.println("Go Back");
		
	}
	
	public void right() {
		System.out.println("Move Forward");
	}
}
