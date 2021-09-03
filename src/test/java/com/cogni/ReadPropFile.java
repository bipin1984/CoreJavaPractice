package com.cogni;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropFile {

	/*
	 * This piece of program will read a properties file and print
	 * all the values present in the properties file..
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\properties\\data.properties");
			prop.load(fis);
			System.out.println("Name of the employee :"+prop.getProperty("name"));
			System.out.println("Age of the employee :"+prop.getProperty("age"));
			System.out.println("Dob of the employee :"+prop.getProperty("dob"));
			System.out.println("Address of the employee :"+prop.getProperty("address"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
