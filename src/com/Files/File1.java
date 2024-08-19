package com.Files;
import java.io.File;
import java.io.File;
import java.io.IOException;

public class File1 {

	public static void main(String[] args) throws IOException {
		
			File myObj = new File("C:\\Users\\Administrator\\Desktop\\Files\\Shourjo.xlsx");
			if(myObj.createNewFile()) {
				System.out.println("File Created: "+myObj.getName());
				System.out.println("Absolute path: "+ myObj.getAbsolutePath());
			}
			else {
				System.out.println("File already exist.");
			}
		
		

	}

}
