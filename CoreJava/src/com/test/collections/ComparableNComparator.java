package com.test.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableNComparator implements Comparator<Integer> {

	
	public static void main(String[] args) {
		

	}

	@Override
	public int compare(Integer a, Integer b) {
		if(a>b)
		return -1;
		else if(a<b)
			return 1;
		else return 0;
	}

}
