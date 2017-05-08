package com.test.algorithmsndatastructures.problems;

import java.util.Arrays;
import java.util.Comparator;

public class AnagramComparator implements Comparator<String> {
		 public String sortChars(String s) {
		 char[] content = s.toCharArray();
		 Arrays.sort(content);
		 return new String(content);
		 }
		
		 public int compare(String s1, String s2) {
		 return sortChars(s1).compareTo(sortChars(s2));
		 }
	public static void main(String[] args) {
		String [] a={"cat","sai","act","ias","top"};
		Arrays.sort(a, new AnagramComparator());
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"  ");
	}

}
