package com.designpatterns.singleton;

import com.test.codingtest.trees.LinkedList;

public class ScarabbleTest {

	

	public static void main(String[] args) {
		
		Singleton newInstance=Singleton.getInstance();
		
		System.out.println("Instance 1 ID"+System.identityHashCode(newInstance));
		
		System.out.println(newInstance.getLetterList());
		
		java.util.LinkedList<String> playerOneTiles=newInstance.getTiles(7);
		
		System.out.println("Player 1"+playerOneTiles);
		
		System.out.println(newInstance.getLetterList());
		
		Singleton instanceTwo =Singleton.getInstance();
		
		System.out.println("Instance 2 ID"+System.identityHashCode(instanceTwo));
		
		System.out.println(instanceTwo.getLetterList());
		
		
		java.util.LinkedList<String> playerTwoTiles=newInstance.getTiles(7);
		
		System.out.println("Player 2"+playerTwoTiles);
		
		
		
	}

}
