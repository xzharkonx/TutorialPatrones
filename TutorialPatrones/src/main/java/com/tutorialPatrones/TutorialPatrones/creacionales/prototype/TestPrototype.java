package com.tutorialPatrones.TutorialPatrones.creacionales.prototype;

public class TestPrototype {
	public static void main(String[] args) {
		Enemy enemy1 = new Enemy(100,100);
		Enemy enemy2 =  new Enemy();
		enemy2.setHealt(enemy1.getHealt());
		enemy2.setDamage(enemy1.getDamage());
		Enemy enemy3 = enemy1;
		
		System.out.println(enemy1);
		System.out.println(enemy2);
		System.out.println(enemy3);
		
		System.out.println("==========");
		
		enemy2.setHealt(0);

		System.out.println(enemy1);
		System.out.println(enemy2);
		System.out.println(enemy3);
		
	}

}
