package com.Intv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFromTextFile {

	public static void main(String[] args) throws IOException {


		
		FileReader fr = new FileReader(".\\src\\main\\resources\\logs\\myData.txt");
		
		BufferedReader br = new BufferedReader(fr);
	
		String str;
		while((str = br.readLine())!=null)
		{
			System.out.println(str);
		}
		
		br.close();
		
		File file = new File(".\\src\\main\\resources\\logs\\myData1.txt");
		
		Scanner sc = new Scanner(file);
		
//		while(sc.hasNext())
//		{
//			System.out.println(sc.nextLine());
//		}
//		
		
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
		
	}
	

}
