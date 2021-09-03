package com.cogni.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBinaryFile {

	public static void main(String[] args) throws IOException {
		
		String fileName = "data.txt";
		String data = "Lines of the file are:\r\n" + 
				"Reading Files in java with two main classes \r\n" + 
				"	1. FileReader : \r\n" + 
				"		1) for text files found in local system..\r\n" + 
				"	   	text files found in server etc.\r\n" + 
				"	    2) FileReader should usually be wrapped in a BufferedFileReader.\r\n" + 
				"	       this saves up the data so that we can deal it a line at time\r\n" + 
				"	       or by character by character \r\n" + 
				"	       \r\n" + 
				"	   \r\n" + 
				"	2. FileInputStream: for both text and binary file that contain weird characters\r\n" + 
				"\r\n" + 
				"Writing a Files in java:\r\n" + 
				"	The logic is completely same but only difference is for a text file \r\n" + 
				"	we should use FileWriter and BufferedFileWriter for text file";
			byte[] buffer = data.getBytes();
		try {
			FileOutputStream outfis = new FileOutputStream(fileName);
			outfis.write(buffer);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
