package com.test.collections;

import java.util.*;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("123");					//String
	//	a.add(new Integer(123));		//Integer object
		System.out.println(a.get(0));
		System.out.println(a.size());
		System.out.println(a.indexOf("1234"));
		a.remove(0);
		a.clear();//clears whole data
		a.add(0, "123");
		a.add(0, "124");
		a.add("12");
		System.out.println(a);
		a.remove(0);
		System.out.println(a);
		a.set(0,"125");
		System.out.println(a.contains("123"));
	
		
	}

}
