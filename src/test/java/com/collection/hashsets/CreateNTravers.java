package com.collection.hashsets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CreateNTravers {

	public static void main(String[] args) {
		
		Set<String> hs = new HashSet<String>();
		hs.add("Umesh");
		hs.add("Bipin");
		hs.add("Gita");
		hs.add("Pinki");
		hs.add("Suman");
		hs.add("Babu");
		hs.add(null);
		
		Iterator itr = hs.iterator();
		
		System.out.println("Elements are 1: ");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Elements are 2: ");
		
		for(String str : hs)
		{
			System.out.println(str);
		}
		
		System.out.println("Elements are 3: ");
		hs.forEach(values -> System.out.println(values));
	}

}
