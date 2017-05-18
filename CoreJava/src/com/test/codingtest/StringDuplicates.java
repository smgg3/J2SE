package com.test.codingtest;

public class StringDuplicates {

	public static boolean isUniqueChars(String str) {
		 int checker = 0;
		 Integer m=checker;
		
		 for (int i = 0; i < str.length(); ++i) {
			
		 int val = str.charAt(i) - 'a';
		 if ((checker & (1 << val)) > 0) return false;
		 checker |= (1 << val);
		 }
		 return true;
		 }
	public static void main(String[] args) {
		System.out.println(isUniqueChars("bob"));

	}

}
