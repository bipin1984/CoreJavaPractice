package com.collection.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UpdateArrayListInteger {

	public static void main(String[] args) {
		
	
		List<String> names = new ArrayList<String>();
		
		names.add("Bipin");
		names.add("Pinki");
		names.add("Sumna");
		names.add("Umesh");
		names.add("Gita");
		names.add("Babu");
		String replacedName = names.set(4,"Malati");
	
		System.out.println(names);
		System.out.println(replacedName);
	// remove element from the arraylist	
//		names.remove(new String("Pinki"));
//		names.remove(0);
//		System.out.println(names);
	// iterate elements
		String[] arr = new String [names.size()];
//		Iterator its = names.iterator();
//		
//		while(its.hasNext())
//		{
//	
//			System.out.println(its.next());
//			
//		}
		

		for(String name:names)
		{
			System.out.println(name);
		}
	}

}
