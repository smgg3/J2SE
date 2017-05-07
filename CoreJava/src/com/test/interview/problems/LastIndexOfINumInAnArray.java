package com.test.interview.problems;
import java.util.*;
public class LastIndexOfINumInAnArray {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		arr.add(1);
		arr.add(2);
		arr.add(6);
		arr.add(3);
		arr.add(4);
		System.out.println(arr.lastIndexOf(2));
		
		/*
		  int index = -1;

    for (int i = 0; (i < list.length) && (index == -1); i++) {
        if (list[i] == 'e') {
            index = i;
        }
    }
		  */

	}

}
