package com.test.files;

import java.io.File;
import java.io.IOException;

public class Files {

	public static void main(String[] args) {
		File f=new File("C://Users//Sravani Chowdary//Documents//GitHub//Sravani//CoreJava//src//com//test//files//input.txt");
		System.out.println(f.getAbsolutePath());
		try {
			if(!f.exists()){
			f.createNewFile();
			System.out.println("File Created");
			}
			else
				System.out.println("File already existed");
		} catch (IOException e) {
			
			e.printStackTrace();

			System.out.println(e);
		
		}
		
	}

}
