package com.collection.hashMaps;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MapSorting {
	
	public static HashMap<String,Integer> sortByValue(HashMap<String, Integer> hm)
	{
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());
		
	    Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });
		System.out.println(list);
		HashMap<String, Integer> tempHM = new LinkedHashMap<String,Integer>();
		for(Map.Entry<String,Integer> key : list)
		{
			tempHM.put(key.getKey(),key.getValue());
		}
		
		 for(Map.Entry<String,Integer> val:hm.entrySet())
		    {
		    	System.out.println("Key is :" +val.getKey() + "and Value is : "+val.getValue());
		    }
		
		return tempHM;
	}
	

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Math", 98);
	    hm.put("Data Structure", 85);
	    hm.put("Database", 91);
	    hm.put("Java", 95);
	    hm.put("Operating System", 79);
	    hm.put("Networking", 80);
	    
	    Map<String, Integer> hm1 = sortByValue(hm);
	    
	    for(Map.Entry<String,Integer> val:hm1.entrySet())
	    {
	    	System.out.println("Key is :" +val.getKey() + "and Value is : "+val.getValue());
	    }
	}

}
