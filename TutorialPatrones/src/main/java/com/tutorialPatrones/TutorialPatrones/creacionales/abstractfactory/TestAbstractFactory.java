package com.tutorialPatrones.TutorialPatrones.creacionales.abstractfactory;

import com.tutorialPatrones.TutorialPatrones.creacionales.abstractfactory.armor.Armor;
import com.tutorialPatrones.TutorialPatrones.creacionales.abstractfactory.enemy.Enemy;
import com.tutorialPatrones.TutorialPatrones.creacionales.abstractfactory.factory.EnemyAbstractFactory;
import com.tutorialPatrones.TutorialPatrones.creacionales.abstractfactory.factory.MageFactory;
import com.tutorialPatrones.TutorialPatrones.creacionales.abstractfactory.factory.WarriorFactory;
import com.tutorialPatrones.TutorialPatrones.creacionales.abstractfactory.weapon.Weapon;

public class TestAbstractFactory {

	public static void main(String[] args) {
		
		EnemyAbstractFactory factory = new WarriorFactory();
		
		Enemy warrior = factory.createEnemy();
		Armor heavyArmor = factory.createArmor();
		Weapon axe = factory.createWeapon();
		
		warrior.attack();
		heavyArmor.protect();
		axe.damage();
		
		/**
		 * Change the Fabric and chage all methods info contain.
		 */
		factory = new MageFactory();
		
		Enemy mage = factory.createEnemy();
		Armor robe = factory.createArmor();
		Weapon wizardStaff = factory.createWeapon();

		mage.attack();
		robe.protect();
		wizardStaff.damage();
	}

}
