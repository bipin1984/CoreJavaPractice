package com.Intv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToTextFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter(".\\src\\main\\resources\\logs\\myData1.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Hello World!\n");
		bw.write("This is an example for writing data into text file!\n");
		bw.write("This is an example for writing data into text file!\n");
		bw.close();
	}

}
