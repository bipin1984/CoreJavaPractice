package com.collection;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(100, "Bipin");
		//ht.put(null,"Alok");
		ht.put(101, "Alok");
		//ht.put(102, null);
		ht.put(103, "Pinki");
		System.out.println(ht.get(100));

	}

}
