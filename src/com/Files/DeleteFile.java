package com.Files;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
	
			File myObj = new File("C:\\Users\\Administrator\\Desktop\\Files\\Shourjo.xlsx");
			if(myObj.delete()) {
				System.out.println("File Deleted: "+myObj.getName());
			}
			else {
				System.out.println("Failed to delete.");
			}
		

	}

}
