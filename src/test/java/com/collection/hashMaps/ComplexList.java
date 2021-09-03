package com.collection.hashMaps;

import java.util.ArrayList;
import java.util.HashMap;

class MapData
{
	int rollNumber;
	String name;
	public MapData(int rollNumber,String name)
	{
		this.rollNumber = rollNumber;
		this.name = name;
	}
	
	public int getRollNumber() {
		
		return rollNumber;
	}
	
	public String getName()
	{
		
		return name;
	}
}




public class ComplexList {

	public static void main(String[] args) {
		
		ArrayList<MapData> list = new ArrayList<MapData>();
		list.add(new MapData(10,"Bipin Behera"));
		list.add(new MapData(20,"Pranati M"));
		list.add(new MapData(30,"Suman Priya"));
		list.add(new MapData(50,"Umesh Behera"));
		list.add(new MapData(60,"Gitanjali Behera"));
		list.add(new MapData(70,"Devansh Behera"));
		
		System.out.println("List is :" +list);
		
		// From List to Map
		
		HashMap<Integer, String> hm = new HashMap();
		list.forEach(n -> {hm.put(n.getRollNumber(),n.getName());});
		hm.forEach((k,v) -> System.out.println("Roll No :"+k +" Name: "+v));
	}

}
