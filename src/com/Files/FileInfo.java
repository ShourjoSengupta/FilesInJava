package com.Files;

import java.io.File;
//import java.io.IOException;

public class FileInfo {

	public static void main(String[] args) {
		
			File myObj = new File("C:\\Users\\Administrator\\Desktop\\Files\\Shourjo.txt");
			if(myObj.exists()) {
				System.out.println("File name: "+myObj.getName());
				System.out.println("Absolute path: "+ myObj.getAbsolutePath());
				System.out.println("Writeable: "+ myObj.canWrite());
				System.out.println("Readable: "+ myObj.canRead());
				System.out.println("File size in bytes: "+ myObj.length());
			}
			else {
				System.out.println("File does not exist.");
			}
		

	}

}
