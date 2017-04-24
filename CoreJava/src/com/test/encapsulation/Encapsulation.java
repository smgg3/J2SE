package com.test.encapsulation;

public class Encapsulation {

	private int value=0;
	private float pi=3.14f;
	
	public int getSum(int a ,int b){
		value=a+b;
		return value;
		
	}
	
	public void reset(){
		
		value=0;
	}
	public float getPiValue() {
		return pi;
	}

	public void setPiValue() {
		this.pi = 2.13f;
	}
	public static void main(String[] args) {
		
		Encapsulation e=new Encapsulation();
		e.pi=3.1f;
		System.out.println(e.getPiValue());
		e.setPiValue();
		System.out.println(e.getPiValue());
	}

	

}
