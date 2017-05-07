package com.test.interview.problems;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		
		int n=(int)( Math.random()*100+1);
		System.out.println(n);
		
		//random() method returns a random number between 0.0 and 0.999. So, you multiply it by 50, 
		//so upper limit becomes 0.0 to 49.95, when you add 1, it becomes 1.0 to 50.95, now when you you
		//truncate to int, you get 1 to 50
		Random rand=new Random();
		int m=rand.nextInt(50);
		System.out.println(m);

	}

}
