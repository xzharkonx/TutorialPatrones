package com.tutorialPatrones.TutorialPatrones.creacionales.prototype;

public class Mage extends Enemy{
	
	private int mana;

	public Mage(int healt, int damage, int mana) {
		super(healt, damage);
		this.mana = mana;
	}

	public Mage(Mage mage) {
		super(mage);
		if(mage != null) {
			setMana(mage.getMana());
		}
	}
	
	@Override
	public Enemy clone() {
		return new Mage(this);
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	@Override
	public String toString() {
		return "Mage [mana=" + mana + ", healt=" + healt + ", damage=" + damage + "]";
	}	
	

}
