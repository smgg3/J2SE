package com.test.collections;

import java.util.*;

public class LinkedLists {

	public static void main(String[] args) {
		LinkedList <String> l=new LinkedList<String>();
		
		l.add("sravani");
		l.add("sai");
		System.out.println(l);
		l.addFirst("nani");
		l.addLast("chinna");
		System.out.println(l);
		System.out.println(l.indexOf("nani"));
		
		for(Iterator<String> iter=l.iterator();iter.hasNext();)
		{
			System.out.println(iter.next());
			System.out.println();
			
		}
			
		for(String s: l){
			System.out.println(s);
		}
		
		System.out.println(l.get(1));

	}

}
