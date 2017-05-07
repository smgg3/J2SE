package com.test.interview.problems;

import java.util.Arrays;

public class Anagrams {

	boolean isAnagram(String s1,String s2){
		
		String cs1=s1.replaceAll("//s", "");
		String cs2=s2.replaceAll("//s","");
		if(cs1.length()!=cs2.length()){
			return false;
		}
		else{
			char[] s1arr=cs1.toCharArray();
			char[] s2arr=cs2.toCharArray();
			Arrays.sort(s1arr);
			Arrays.sort(s2arr);
			return Arrays.equals(s1arr, s2arr);
		}
		
	}
	public static void main(String[] args) {
		
		Anagrams obj=new Anagrams();
		boolean status=obj.isAnagram("act", "cay");
		System.out.print(status);
	}

}
