package com.test.inheritence;

public class TripleControlBlockOperator {

	public static void main(String[] args) {
		int num=(5>2)?1:0;
		System.out.println(num);
		num=(5>2)?((2<1)?1:0):0;
		System.out.println(num);

	}

}
