package com.test.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparableSort {

	public static void main(String[] args) {
		ArrayList<ObjectsSort> l=new ArrayList<ObjectsSort>();
		
		for(int i=0;i<5;i++){
			ObjectsSort car=new ObjectsSort("H"+i);
			car.setPrice((int)(Math.random()*100)+1);
			l.add(car);
		}
		
		Iterator<ObjectsSort> carIterator=l.iterator();
		while(carIterator.hasNext()){
			ObjectsSort c=carIterator.next();
			System.out.println(c+"Price is :"+c.getPrice());
		}
		Collections.sort(l);
		System.out.println("After Sorting");
		Iterator<ObjectsSort> carIteratorAfterSort=l.iterator();
		while(carIteratorAfterSort.hasNext()){
			ObjectsSort c=carIteratorAfterSort.next();
			System.out.println(c+" Registration number is "+c.getR_num()+"Price is :"+c.getPrice());
		}

	}

}
