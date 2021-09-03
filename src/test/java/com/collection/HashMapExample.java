package com.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		HashMap hm1 = new HashMap();
		System.out.println(hm.equals(hm1));
		hm.put("Name","Bipin Behera");
		hm.put("Age",43);
		hm.put("Qualification","MCA");
		hm.put("Name","Bipin Behera");
		hm.put("Salary", 85000.75);
		hm.put(null, "Barang");
		hm.put("Address", "Barang");
		hm.put("Address1", null);
		hm.put("Address2", null);
		System.out.println(hm.values());
		System.out.println(hm.keySet());
		System.out.println(hm.containsKey("Name"));
		System.out.println(hm.containsKey("XYZ"));
		System.out.println(hm.containsValue("MCA"));
		System.out.println(hm.containsValue("XYZ"));
		System.out.println("Entry Set "+hm.entrySet());
		//hm.clear();
		System.out.println(hm.entrySet());
		//HashMap ht = new HashTable();
		
	
		for(Object i:hm.keySet())
		{
			System.out.println(i);
		}
		for(Object i:hm.values())
		{
			System.out.println(i);
		}
		
		for(Object i:hm.keySet())
		{
			System.out.println(i + " Its Values : "+hm.get(i));
		}
		
		hm.forEach((k,v) -> System.out.println("Key : "+k + " Value : "+v));
	
	}

}
