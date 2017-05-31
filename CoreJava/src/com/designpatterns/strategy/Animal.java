package com.designpatterns.strategy;

public class Animal {

	private String name;
	private double height;
	private int weight;
	private String fav_food;
	private double speed;
	private String sound;
	
	public Flys flyingtype;
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public double getHeight() {
		return height;
	}

	public int getWeight() {
		return weight;
	}

	public String getFav_food() {
		return fav_food;
	}

	public double getSpeed() {
		return speed;
	}

	public String getSound() {
		return sound;
	}

	public Flys getFlyingtype() {
		return flyingtype;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(int weight) {
		if(weight>0)
		this.weight = weight;
		else
			System.out.println("Weight must be greater than 0");
	}

	public void setFav_food(String fav_food) {
		this.fav_food = fav_food;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public void setFlyingtype(Flys flyingtype) {
		this.flyingtype = flyingtype;
	}
	public String tryToFly(){
		return flyingtype.fly();
	}

}
