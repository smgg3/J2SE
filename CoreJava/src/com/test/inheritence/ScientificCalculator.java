package com.test.inheritence;

public class ScientificCalculator extends RegularCalculator {

	public float cube(float a){
		return (float) Math.pow(a, 3);
		
		
	}
	public float square(float a){
		return (float) Math.pow(a, 2);
	} 

}
