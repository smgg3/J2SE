package com.test.polymorphism;

public class OverRiding extends OverLoading {

	public int sum(int a,int b){
		return a+b+10;
	}
	public float sum(int a,float b){
		
		return a+b+10;
	}
	protected int sum(int a,int b,int c,int d){
		
		return a+b+c+d+10;
	}
	
	public int  product(int a,int b){
		return a*b;
	}
	
	public static void main(String[] args) {
		
		OverLoading ol=new OverLoading();
		System.out.println(ol.sum(2,3));
		
		OverLoading ol1=new OverRiding();
		System.out.println(ol1.sum(2,3));
		
		OverRiding ol2=new OverRiding();
		System.out.println(ol2.sum(2,3));
		System.out.println(ol2.sum(1,2,3,4));
		
		System.out.println(ol2.sum(2,3.12f));
		
		//typecasting objects
		System.out.println(((OverRiding) ol1).product(2,3)); //we can't access product() method with the object ol1 because we have created it with the reference of parent class but parent class dont have product() method in common with child class. So to access that using ol1 we need typecast the object with child class
		
	}

}
