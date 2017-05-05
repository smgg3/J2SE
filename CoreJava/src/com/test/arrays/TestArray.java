package com.test.arrays;

public class TestArray {

	public static void main(String[] args) {
		int a[]=new int[20];
		a[1]=30;
		a[19]=100;
		System.out.println(a[19]);
		for(int i=1;i<a.length;i++){
			
			System.out.println(a[i]);
		}
		try{
			
			System.out.println(a[-8]);
		}
		catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
		}
		
		String [] b=new String[20];

	}

}
