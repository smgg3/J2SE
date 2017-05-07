package com.test.interview.problems;

public class ArmSsrong {

	public static void main(String[] args) {
		int n=1634;
		String s=(new Integer(n)).toString();//n="";
		int temp=n;
		int sum=0;
		while(n!=0){
			sum=(int) (sum+Math.pow(n%10,s.length()));
			n=n/10;
		}
		if(temp==sum)
			System.out.println(temp+" is an armstrong number");
		else
			System.out.println(temp+" is not an armstrong number");

	}

}
