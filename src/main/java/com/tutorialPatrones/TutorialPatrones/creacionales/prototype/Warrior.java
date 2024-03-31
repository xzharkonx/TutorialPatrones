package com.tutorialPatrones.TutorialPatrones.creacionales.prototype;

public class Warrior extends Enemy{

	private int endurance;
	
	public Warrior(Warrior warrior) {
		super(warrior);
		if(warrior != null)
			setEndurance(warrior.getEndurance());
	}

	public Warrior(int healt, int damage, int endurance) {
		super(healt, damage);
		this.endurance = endurance;
	}
	
	@Override
	public Enemy clone() {
		return new Warrior(this);
	}

	public int getEndurance() {
		return endurance;
	}

	public void setEndurance(int endurance) {
		this.endurance = endurance;
	}

	@Override
	public String toString() {
		return "Warrior [endurance=" + endurance + ", healt=" + healt + ", damage=" + damage + "]";
	}
	
}
