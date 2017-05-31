package com.designpatterns.strategy;

public class Dog extends Animal{

	public Dog() {
		super();
		setSound("Bark");
		setFlyingtype(new CantFly());
	}
	public void digHole(){
		System.out.println("Dug a hole");
	}

}
