package com.collection.Vector;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class AddingElementTovector {

	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<String>();
		vector.add("Bipin");
		vector.add("Pinki");
		vector.add("Suman");
		vector.add("Umesh");
		vector.add("Gita");
		vector.add("Babu");
		Enumeration <String> data = vector.elements();
		while(data.hasMoreElements())
		{
			System.out.println(data.nextElement());
		}
	
		System.out.println(vector);
		vector.add(3, "Bipin");
		System.out.println(vector);
		vector.set(3, "Kishori");
		System.out.println(vector);
//		vector.remove(3);
//		System.out.println(vector);
		// Clear vector - remove all the elements
//		vector.clear();
//		System.out.println(vector);
//		System.out.println("Is there any element :"+vector.isEmpty());
	
	Vector<String> v1 = new Vector<String>();
		
	for(int i= vector.size()-1;i>=0;i--)
	{
		v1.add(vector.get(i));
	}
	
	for(int i= v1.size()-1;i>=0;i--)
	{
		System.out.println(v1.get(i));
	}
	
	String max = Collections.max(v1);
	String min = Collections.min(v1);
	System.out.println(max);
	System.out.println(min);
	}

}
