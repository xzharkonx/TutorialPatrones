package com.tutorialPatrones.TutorialPatrones.creacionales.prototype;

public class Enemy {
	private int healt;
	private int damage;
	
	public Enemy() {
		super();
	}
	public Enemy(int healt, int damage) {
		super();
		this.healt = healt;
		this.damage = damage;
	}
	
	public int getHealt() {
		return healt;
	}
	public int getDamage() {
		return damage;
	}
	public void setHealt(int healt) {
		this.healt = healt;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}

	@Override
	public String toString() {
		return "Enemy [healt=" + healt + ", damage=" + damage + "]";
	}
	
	

}
