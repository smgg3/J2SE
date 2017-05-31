package com.designpatterns.strategy;

public interface Flys {
	public String fly();
}
class Fly implements Flys{

	@Override
	public String fly() {
		return "Flying High";
		
	}
}
class CantFly implements Flys{

	@Override
	public String fly() {
		return "Can't Fly";
		
	}
	
}
