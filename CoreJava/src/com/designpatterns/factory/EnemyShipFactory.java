package com.designpatterns.factory;

public class EnemyShipFactory {

	public EnemyShipFactory() {
		// TODO Auto-generated constructor stub
	}
	public EnemyShip makeEnemyShip(String newShipType){
		EnemyShip newShip=null;
		if(newShipType.equals("U")){
			return new UFOEnemyShip();
		}
		else
			if(newShipType.equals("R")){
				return new RocketEnemyShip();
			}
		return null;
		
	}
}
