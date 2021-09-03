package com.cogni;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeNDeselialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Demo obj = new Demo(10,"Bipin Behera");
		String filename = "file.ser";
		
		FileOutputStream file = new FileOutputStream(filename);
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(obj);
		
		out.close();
		file.close();
		
		System.out.println("Object has been serialized !");
		
		Demo obj1 = null;
		
		FileInputStream file1 = new FileInputStream(filename);
		ObjectInputStream in = new ObjectInputStream(file1);
		
		obj1 = (Demo)in.readObject();
		in.close();
		file1.close();
		
		System.out.println("Object has been deserialized !");
		System.out.println("a = " + obj1.a);
		System.out.println("a = " + obj1.name);
	}

}
