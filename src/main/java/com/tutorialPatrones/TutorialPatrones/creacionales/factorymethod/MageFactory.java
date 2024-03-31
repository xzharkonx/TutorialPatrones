package com.tutorialPatrones.TutorialPatrones.creacionales.factorymethod;

public class MageFactory extends EnemyFactory{

	@Override
	public Enemy createEnemy() {
		return new Mage();
	}

}
