package com.test.collections;


import java.util.ArrayList;
import java.util.*;

public class ObjectEqualsAndHashCodeTest {

	public static void main(String[] args) {
		HashSetMethods contact1=new HashSetMethods(1,"Sravani","1111111111");
		HashSetMethods contact2=new HashSetMethods(2,"Sai","2222222222");
		HashSetMethods contact3=contact1;//new HashSetMethods(3,"Nani","3333333333");
//		System.out.println("Using == contact1 and contact2 ==>"+(contact1==contact2));
//		System.out.println("Using == contact1 and contact3 ==>"+(contact1==contact3));
//		
//		System.out.println("Using equals method contact1 and contact2 ==>"+(contact1.equals(contact2)));
//		System.out.println("Using equals method contact1 and contact3 ==>"+(contact1.equals(contact3)));
//		
//		System.out.println(contact1.toString());
//		
//		if(contact1==new HashSetMethods(1,"Sravani","1111111111")){
//			System.out.println("They are equal");
//		}
//		else
//		{
//			System.out.println("They are not equal");
//		}
		
//		List<HashSetMethods> list=new ArrayList<HashSetMethods>();
//		list.add(contact1);
//		list.add(contact2);
//		
//		if(list.contains(contact1)){
//			
//			System.out.println("YES");
//		}
//		else
//		{
//			System.out.println("No");
//		}
//		
//		
//		if(list.contains(new HashSetMethods(1,"Sravani","1111111111"))){
//			System.out.println("List contains the contact1");
//		}
//		else{
//			System.out.println("List doesn't contain contact1");
//		}
//		//equals
//		if(contact1.equals(new HashSetMethods(1,"Sravani","1111111111"))){
//			System.out.println("Yes using Override equals method");
//		}
//		else
//			System.out.println("No using Override euals method");
		
		//hashcode
		Set<HashSetMethods> l=new HashSet<HashSetMethods>();
		l.add(contact1);
		l.add(contact2);
		
		if(l.contains(new HashSetMethods(1,"Sravani","1111111111"))){
			System.out.println("List contains the contact1");
		}
		else{
			System.out.println("List doesn't contain contact1");
		}
		System.out.println(l);
	}

}
