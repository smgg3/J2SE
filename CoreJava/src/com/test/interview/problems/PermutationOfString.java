package com.test.interview.problems;

public class PermutationOfString {

	void permutation(String perm,String s){
		if(s.isEmpty()){
			System.out.println(perm+s);
		}
		else{
			for(int i=0;i<s.length();i++){
				permutation(perm+s.charAt(i),s.substring(0, i)+s.substring(i+1,s.length()));
			}
			
		}
	}
	public static void main(String[] args) {
		(new PermutationOfString()).permutation("","sai");

	}

}
