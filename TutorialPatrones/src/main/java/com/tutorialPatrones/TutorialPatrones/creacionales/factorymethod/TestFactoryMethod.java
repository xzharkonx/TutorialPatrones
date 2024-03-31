package com.tutorialPatrones.TutorialPatrones.creacionales.factorymethod;

public class TestFactoryMethod {
	
	public static void main(String[] args) {
		Enemy warrior = new WarriorFactory().createEnemy();
		Enemy mage = new MageFactory().createEnemy();
		warrior.atack();
		mage.atack();
		Warrior guerrero = (Warrior) warrior;
		guerrero.setName("Leonidas");
		System.out.println(guerrero.getName());
		guerrero.atack();
	}

}
