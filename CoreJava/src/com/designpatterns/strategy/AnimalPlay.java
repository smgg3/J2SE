package com.designpatterns.strategy;

public class AnimalPlay {

	public static void main(String[] args) {
		Animal sparky = new Dog();
		Animal tweety = new Bird();
		System.out.println(sparky.tryToFly());
		System.out.println(tweety.tryToFly());
		
		sparky.setFlyingtype(new Fly());
		
		System.out.println(sparky.tryToFly());
	}

}
