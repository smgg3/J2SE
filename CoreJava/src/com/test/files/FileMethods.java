package com.test.files;

import java.io.File;
import java.io.IOException;

public class FileMethods {

	public static void main(String[] args) {
		File f=new File("C://Users//Sravani Chowdary//Documents//GitHub//Sravani//CoreJava//src//com//test//files");
		/*File f1=new File("C://Users//Sravani Chowdary//Documents//GitHub//Sravani//CoreJava//src//com//test//files//1");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		f1.mkdir();*/
//		//f.delete();
		//f1.delete();
		
	/*	String files[]=f.list();
		//for(int i=0;i<files.length;i++){
		for(String file:files){			//enhanced for loop
			System.out.println(file);
		}*/

		File files[]=f.listFiles();
		//for(int i=0;i<files.length;i++){
		for(File file:files){			//enhanced for loop
			System.out.println(file+"  is"+file.isDirectory());
		}
	}

}
