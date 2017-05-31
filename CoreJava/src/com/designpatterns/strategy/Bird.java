package com.designpatterns.strategy;

public class Bird extends Animal{

	public Bird() {
		super();
		setSound("Tweet");
		setFlyingtype(new Fly());
	}

}
