package com.tutorialPatrones.TutorialPatrones.creacionales.builder;

public class TestBuilder {

	public static void main(String[] args) {
		Enemy enemy = Enemy.builder()
				.name("pepe")
				.type("mage")
				.health(100)
				.damage(30)
				.endurance(60)
				.build();
		System.out.println(enemy.toString());
	}
}
