package com.test.datastructures;

import java.util.*;



public class DynamicArrayList {

	public static ArrayList<String> merge(ArrayList<String> a,ArrayList<String> b){
		ArrayList<String> m=new ArrayList<String>();
		Iterator<String> l=  a.iterator();
		while(l.hasNext()){
			m.add(l.next());
		}
		 l=  b.iterator();
		while(l.hasNext()){
			m.add(l.next());
		}
		return m;
		}
	
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("1");
		a.add("2");
		a.add("3");
		

		ArrayList<String> b=new ArrayList<String>();
		b.add("a");
		b.add("sd");
		b.add("s");
		b.add("1d");
		b.add("1s");
		Collections.sort(a);
		
		ArrayList<String> m=merge(a,b);
		Collections.sort(m);
		Iterator l=m.iterator();
		m.addAll(b);
		ListIterator<String> n=m.listIterator();
		while(n.hasNext()){
			System.out.print(n.next()+"  ");
		}
		
	}

}
