package com.cogni.file;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RWTextFile2 {

	public static void main(String[] args) throws IOException {
		String fileName = "fileSystem.txt";
		String line = ""; // this would be used to read one line at a time 
		
		try {
			
			byte[] buffer = new byte[1000];
			FileInputStream fileInput = new FileInputStream(fileName);
			
			int total = 0;
			int nRead = 0;
			System.out.println("Lines of the file are:");
			while((nRead = fileInput.read(buffer))!=-1)
			{
				System.out.println(new String(buffer));
				total += nRead;
			}
			fileInput.close();        
            System.out.println("Read " + total + " bytes");
		} catch (FileNotFoundException ex) {
			
			System.out.println("Unable to open the file"+fileName +"'");
			ex.printStackTrace();
		}
	}
}
