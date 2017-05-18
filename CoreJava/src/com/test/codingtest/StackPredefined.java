package com.test.codingtest;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.*;
public class StackPredefined {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<String>();
		a.add("sai");
		a.add("sravani");
		a.add("sai");
		a.add("sravani");
		a.add("sai");
		a.add("sravani");
		
		System.out.println(a);
		Stack<String> s=new Stack<String>();
		s.addAll(a);
		System.out.println(s.capacity());
		System.out.println(s.size());
		System.out.println(s.pop());
		System.out.println(s.elementAt(4));

	}

}
