package com.collection;

import java.util.HashSet;
import java.util.Iterator;


public class HashSetExample {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet();
		hs.add("Bipin");
		hs.add("Behera");
		//hs.add(43);
		hs.add("Dadhapatana");
		hs.add("Odisha");
		
		//from hashset to array
		String arr[] = new String[hs.size()];
		String arr1[] = hs.toArray(arr);
		for(String n : arr1)
		{
			System.out.print(n + " ");
			
		}
	
		
		Iterator itr = hs.iterator();
		
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	for(String data:hs)
	{
		System.out.print(data +" ");
	}
	
		
		
	}

}
