package com.collection.hashMaps;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class IterateMapVal {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(100, "Bipin");
		ht.put(101, "Alok");
		ht.put(103, "Pinki");
		
		// Retrieve Map Elements with iterator
		Iterator<Map.Entry<Integer, String>> it = ht.entrySet().iterator();
		while(it.hasNext())
		{
			 Map.Entry<Integer, String> pair = it.next();
			 System.out.println("Key is : " + pair.getKey() + " Value is :"+pair.getValue());
		}
		
		// Map Entry
		
		for(Map.Entry<Integer,String> pair : ht.entrySet())
		{
			System.out.println("Key : "+pair.getKey() + " , " + " Value : "+pair.getValue());
		}
		
		//  key value pair with lambda
		ht.forEach((key,value) -> System.out.println("Keys "+key+","+ "Values :"+value));
		
		// separately only key
		for(Integer key : ht.keySet())
		{
			System.out.println("Keys :" +key);
		}
		// separately only value
		for(String value : ht.values())
		{
			System.out.println("Values :" +value);
		}
		
		// Iterate using keySet
		Iterator<Integer> itrs = ht.keySet().iterator();
		while(itrs.hasNext())
		{
			Integer key = itrs.next();
			System.out.println("Key : "+key + " , Value : " +ht.get(key));
		}
		// Iterate with Map.entry
		
		for(Iterator<Map.Entry<Integer, String>> its = ht.entrySet().iterator(); its.hasNext();)
		{
			Map.Entry<Integer,String> entry = its.next();
			System.out.println("Key is :" + entry.getKey() + " Value is :"+entry.getValue());
		}
		
		//
		ht.entrySet().stream().forEach(val -> System.out.println("Key : " + val.getKey() + " Value :" +val.getValue()));
		
		ht.entrySet().stream().parallel().forEach(val -> System.out.println("Key In Parallel : " + val.getKey() + " Value In Parallel :" +val.getValue()));
	
	}

}
