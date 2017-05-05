package com.test.collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
public class CollectionsSort {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(6);
		a.add(2);
		a.add(0);
		a.add(3);
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.addAll(a);
		System.out.println("Original list"+a);
		Collections.sort(a);
		System.out.println("Default sort"+a);
		Collections.sort(a,new ComparableNComparator());
		System.out.println("Customized sort"+a);
		System.out.println("backup"+a1);
		Collections.sort(a,new OddEvenComparator());
		System.out.println("Customized Even Odd sort"+a);
		//Sort a string based on length of the string
		
		
	}

}

