package com.collection.hashsets;

import java.util.HashSet;
import java.util.TreeSet;

public class SortWithTreeSet {
	
	public static void main(String arags[])
	{
	HashSet<Integer> hs = new HashSet<Integer>();
	hs.add(76);
	hs.add(73);
	hs.add(84);
	hs.add(65);
	hs.add(93);
	hs.add(77);
	
	TreeSet<Integer> treeset = new TreeSet<Integer>(hs);
	System.out.println("Sorted Marks :");
	treeset.forEach(data->System.out.println(data));
	
	}
}
