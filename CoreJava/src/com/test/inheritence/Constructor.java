package com.test.inheritence;

public class Constructor {

	int today;
	Constructor(int a){
		//System.out.println("Today's date is:"+a);
		today=a;
	}
	public static void main(String[] args) {
		Constructor c=new Constructor(10);
		System.out.println("Today's date is:"+c.today);

	}

}
