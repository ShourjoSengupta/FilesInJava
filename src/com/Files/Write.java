package com.Files;

import java.io.FileWriter;
import java.io.IOException;

public class Write {
	public static void main(String[] args) {
		
		try {
			FileWriter mywriter= new FileWriter("C:\\Users\\Administrator\\Desktop\\Files\\Shourjo.txt");
			mywriter.write("Welcome To Wrestlemania");
			mywriter.close();
			System.out.println("Write Successful");
		} catch(IOException e){
			System.out.println("An error occured");
			e.printStackTrace();
		}
	

}

}
