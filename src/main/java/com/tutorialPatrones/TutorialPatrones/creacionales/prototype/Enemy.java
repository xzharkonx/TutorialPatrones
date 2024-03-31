package com.tutorialPatrones.TutorialPatrones.creacionales.prototype;

public abstract class Enemy {
	protected int healt;
	protected int damage;
	
	public Enemy() {
		super();
	}
	
	public Enemy(int healt, int damage) {
		super();
		this.healt = healt;
		this.damage = damage;
	}
	
	public Enemy(Enemy enemy) {
		if(enemy != null) {
			setHealt(enemy.getHealt());
			setDamage(enemy.getDamage());
		}
	}
	
	public abstract Enemy clone();
	
	
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
