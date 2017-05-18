package com.test.codingtest;
import java.io.*;
import java.util.*;
public class ScannerPrintReverse {

	public static void printReverse(Scanner s){
		while(s.hasNext()){
			String l=s.next();
			printReverse(s);
			System.out.println(l);
		}
	}
	public static void main(String[] args) {
		
		Scanner s=new Scanner("I am Sravani");
		printReverse(s);
		while(s.hasNext()){
			System.out.println(s.next());
		}
	}

}
