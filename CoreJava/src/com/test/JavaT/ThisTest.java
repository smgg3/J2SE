package com.test.JavaT;

public class ThisTest {

	int age;
	public void setAge(int age){
		age=age;
	}
	public static void main(String[] args) {
		
		ThisTest obj=new ThisTest();
		obj.age=10;
		obj.setAge(20);
		System.out.println(obj.age);
		
	}

}
