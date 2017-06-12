package com.designpatterns.singleton;

public class ScrabbleTestThreads {

	public static void main(String [] args){
		Runnable getTiles=new GetTheLists();
		Runnable getTilesAgain=new GetTheLists();
		
		new Thread(getTiles).start();
		new Thread(getTilesAgain).start();
	}
}
