package com.tutorialPatrones.TutorialPatrones.creacionales.abstractfactory.factory;

import com.tutorialPatrones.TutorialPatrones.creacionales.abstractfactory.armor.Armor;
import com.tutorialPatrones.TutorialPatrones.creacionales.abstractfactory.enemy.Enemy;
import com.tutorialPatrones.TutorialPatrones.creacionales.abstractfactory.weapon.Weapon;

/**
 * {@summary: This class is the "Heart" of the "Abstract Factory Pattern"}
 */
public abstract class EnemyAbstractFactory {
	
	public abstract Enemy createEnemy();
	public abstract Armor createArmor();
	public abstract Weapon createWeapon();
}
