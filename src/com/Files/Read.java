package com.Files;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Read {

	public static void main(String[] args) {
		try {
			File myObj= new File("C:\\Users\\Administrator\\Desktop\\Files\\Shourjo.txt");
			Scanner myReader = new Scanner(myObj);
			
			while(myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} catch(FileNotFoundException e){
			System.out.println("An error occured");
			e.printStackTrace();
		}

	}

}
