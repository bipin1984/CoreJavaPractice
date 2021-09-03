package com.cogni.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RWTextFile {

	public static void main(String[] args) throws IOException {
		String fileName = "Date.doc";
		String line = ""; // this would be used to read one line at a time 
		
		try {
			
			FileReader fileReader = new FileReader(fileName);
			BufferedReader buffReader = new BufferedReader(fileReader);
			
			int count = 0;
			System.out.println("Lines of the file are:");
			while((line = buffReader.readLine())!=null)
			{
				
				System.out.println("Line "+" : "+count+" "+ line);
				count++;
				
			
			}
			
			
		} catch (FileNotFoundException ex) {
			
			System.out.println("Unable to open the file"+fileName +"'");
			ex.printStackTrace();
		}
		
		
	}

}
