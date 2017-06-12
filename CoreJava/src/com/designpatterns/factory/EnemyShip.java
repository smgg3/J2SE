package com.designpatterns.factory;

public abstract class EnemyShip {

	String name;
	double amtDamage;
	
	public String getName() {
		return name;
	}
	public double getAmtDamage() {
		return amtDamage;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAmtDamage(double amtDamage) {
		this.amtDamage = amtDamage;
	}
	
	public void followHeroShip(){
		System.out.println(getName()+"Following Hero Ship");
	}
	public void displayEnemyShip(){
		System.out.println(getName()+"Display EnemyShip");
	}
	public void enemyShipShoots(){
		System.out.println(getName()+"Enemyship Shooting");
	}
}
