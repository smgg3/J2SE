package com.designpatterns.singleton;

import java.util.LinkedList;

public class GetTheLists implements Runnable{

	public void run(){
		Singleton newInstance =Singleton.getInstance();
		
		System.out.println("Instance  ID"+System.identityHashCode(newInstance));
		
		System.out.println(newInstance.getLetterList());
		
		LinkedList<String> playerOneTiles=newInstance.getTiles(7);
		
		System.out.println("Player "+playerOneTiles);
		
		System.out.println("Got Tiles");
		
		
	}

}
