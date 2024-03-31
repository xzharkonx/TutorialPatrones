package com.tutorialPatrones.TutorialPatrones.creacionales.abstractfactory.factory;

import com.tutorialPatrones.TutorialPatrones.creacionales.abstractfactory.armor.Armor;
import com.tutorialPatrones.TutorialPatrones.creacionales.abstractfactory.armor.HeavyArmor;
import com.tutorialPatrones.TutorialPatrones.creacionales.abstractfactory.enemy.Enemy;
import com.tutorialPatrones.TutorialPatrones.creacionales.abstractfactory.enemy.Warrior;
import com.tutorialPatrones.TutorialPatrones.creacionales.abstractfactory.weapon.Axe;
import com.tutorialPatrones.TutorialPatrones.creacionales.abstractfactory.weapon.Weapon;

public class WarriorFactory extends EnemyAbstractFactory{

	@Override
	public Enemy createEnemy() {
		return new Warrior();
	}

	@Override
	public Armor createArmor() {
		return new HeavyArmor();
	}

	@Override
	public Weapon createWeapon() {
		return new Axe();
	}

}
