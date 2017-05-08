package com.test.collections;
import java.util.Map.Entry;
import java.util.*;

public class HashMaps {
	public static void main(String[] args) {
		HashMap <Integer,String> t =new HashMap<Integer,String>(); 
		t.put(1, "sravani");
		t.put(3, "sai");
		t.put(2, "chinna");
		t.put(4, "nani");
		System.out.println(t);
		
		//t.remove(1);
	
	//All entries in HashMap
		//Set<Entry<Integer,String>> eset= t.entrySet();
		for(Entry<Integer,String> eset:t.entrySet()){
			System.out.println(eset.getKey()+eset.getValue());
			//System.out.println(eset);
		}
	//Keys
		//Set<Integer> keys=	t.keySet();
		for(Integer key:t.keySet()){
			System.out.println(key+t.get(key));
		}
	}
	
}
