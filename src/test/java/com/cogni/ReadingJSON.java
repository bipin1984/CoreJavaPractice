package com.cogni;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;

import org.apache.commons.math3.exception.NullArgumentException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class ReadingJSON {

	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream is = new FileInputStream("E:\\Trainings\\Live\\Java\\Selenium\\CoreJavaPractice\\TestJSON.json");
		if(is==null)
		{
			throw new NullPointerException("Connot find the file");
		}
		
		JSONTokener tokener = new JSONTokener(is);
		
		JSONObject jobj = new JSONObject(tokener);
		
		System.out.println("First Name :"+jobj.getString("firstName"));
		
		JSONArray contacts = jobj.getJSONArray("Phone Number");
		for(int i=0;i<contacts.length();i++)
		{
			System.out.println(contacts.get(i));
		}
		

		
		

	}

}
