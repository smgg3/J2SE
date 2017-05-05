package com.test.datatypes;

public class PreDefinedFunctionsForData {

	public static void main(String[] args) {
		
		short a;//2 bytes
		int b;//4 bytes
		long c;//8 bytes
		float d;
		double e;
		boolean f;
		char g;
		String h="Hello , welcome to Java class  Java Heeello";
		
		System.out.println("->"+h+"<-");
		System.out.println(h.toUpperCase());
		System.out.println(h.toLowerCase());
		
		System.out.println("->"+h.trim()+"<-");//removes space on both side
		
		System.out.println(h.indexOf('e'));//left to last
		System.out.println(h.lastIndexOf('e'));//last to left
		System.out.println(h.indexOf('e', 5));//left to right
		System.out.println(h.lastIndexOf('e', 15));//right to left
		System.out.println(h.indexOf('f'));
		
		System.out.println(h.charAt(15));
		//System.out.println(h.charAt(150));//throws exception i.e NULL
		
		System.out.println(h.indexOf("Java"));
		System.out.println(h.indexOf("Java",25));
		
		System.out.println(h.contains("ello"));
		
		System.out.println(h.startsWith("H"));
		System.out.println(h.endsWith(" "));
		
		//isEmpty, length
		
		System.out.println(h.isEmpty());
		System.out.println(!h.isEmpty());
		System.out.println(h.length());
		
		
		//replace, replace all, substring
		
		System.out.println(h.replace('e', 'X'));
		System.out.println(h);
		System.out.println(h.replace("Java","J"));
		System.out.println(h.replace("J","JAVA"));
		System.out.println(h.replaceAll("ee", "e"));
		
		//substring
		System.out.println((h.substring(4,8)).length());
		System.out.println(h.substring(10));//from 10 to end
		System.out.println(h.subSequence(14, 18));
		
		
		
		
		
		
		

	}

}
