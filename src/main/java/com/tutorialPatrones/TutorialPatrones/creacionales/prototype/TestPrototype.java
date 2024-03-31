 package com.tutorialPatrones.TutorialPatrones.creacionales.prototype;

 /**
  * @author Luis
  * @title Patrón de diseño: Prototype.
  * @Description Este patrón nos permitira hacer copias de
  * objetos en instancias independientes para que puedan
  * ser modificados independientemente y no apunten a un
  * solo lugar de memoria durante la instancia. 
  */
public class TestPrototype {
	public static void main(String[] args) {

		Warrior warrior1 = new Warrior(100,100,100);
		Warrior warrior2 = (Warrior) warrior1.clone();
		
		System.out.println(warrior1);
		System.out.println(warrior2);
		System.out.println("=========");
		
		warrior2.setHealt(0);
		Warrior warrior3 = (Warrior) warrior2.clone();
		warrior3.setHealt(80);
		
		System.out.println(warrior1);
		System.out.println(warrior2);
		System.out.println(warrior3);
		System.out.println("================");

		Mage mage1 = new Mage(100,100,100);
		Mage mage2 = (Mage) mage1.clone();
		
		System.out.println(mage1);
		System.out.println(mage2);

		System.out.println("=========");
		mage2.setHealt(0);

		System.out.println(mage1);
		System.out.println(mage2);
		
		System.out.println("================");
	}

}
