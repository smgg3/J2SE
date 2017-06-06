package com.designpatterns.factory;

import java.util.Scanner;

public class EnemyShipTesting {


	public static void main(String[] args) {
		EnemyShipFactory shipFactory=new EnemyShipFactory();
		EnemyShip theEnemy=null;
		Scanner userInput=new Scanner(System.in);
		System.out.println("What type of ship? U/R");
		if(userInput.hasNextLine()){
			String typeOfShip=userInput.nextLine();
			theEnemy=shipFactory.makeEnemyShip(typeOfShip);
		}
		if(theEnemy!=null)
			doStuffEnemy(theEnemy);

	}

	private static void doStuffEnemy(EnemyShip theEnemy) {
		theEnemy.followHeroShip();
		theEnemy.displayEnemyShip();
		theEnemy.enemyShipShoots();
		
	}

}
