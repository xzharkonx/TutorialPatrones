package com.tutorialPatrones.TutorialPatrones.creacionales.abstractfactory.factory;

import com.tutorialPatrones.TutorialPatrones.creacionales.abstractfactory.armor.Armor;
import com.tutorialPatrones.TutorialPatrones.creacionales.abstractfactory.armor.Robe;
import com.tutorialPatrones.TutorialPatrones.creacionales.abstractfactory.enemy.Enemy;
import com.tutorialPatrones.TutorialPatrones.creacionales.abstractfactory.enemy.Mage;
import com.tutorialPatrones.TutorialPatrones.creacionales.abstractfactory.weapon.Weapon;
import com.tutorialPatrones.TutorialPatrones.creacionales.abstractfactory.weapon.WizardStaff;

public class MageFactory extends EnemyAbstractFactory{

	@Override
	public Enemy createEnemy() {
		return new Mage();
	}

	@Override
	public Armor createArmor() {
		return new Robe();
	}

	@Override
	public Weapon createWeapon() {
		return new WizardStaff();
	}

}
