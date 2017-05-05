package com.test.collections;
import java.util.*;
import java.util.TreeSet;

public class HashSets {
	public static void main(String[] args) {
		HashSet<String> t=new HashSet<String>();
		t.add("sravani");
		t.add("sai");
		t.add("nani");
		t.add("chinna");
		System.out.println(t);
		
		HashSet<Integer> t1=new HashSet<Integer>();
		t1.add(4);
		t1.add(2);
		t1.add(3);
		t1.add(1);
		System.out.println(t1.add(1));
		

	}
}
