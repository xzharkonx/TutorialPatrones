package com.tutorialPatrones.TutorialPatrones.creacionales.factory;

public class Warrior implements Enemy{

	@Override
	public void atack() {
		System.out.println("Warrior attack!!.");
		
	}
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
