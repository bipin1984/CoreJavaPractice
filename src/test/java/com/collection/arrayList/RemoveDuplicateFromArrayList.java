package com.collection.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateFromArrayList {
	
	public static <K> ArrayList<K> removeDuplicates(ArrayList<K> list)
	{
		
		ArrayList<K> newList = new ArrayList<K>();
		for(K element: list)
		{
			if(!newList.contains(element))
			{
				newList.add(element);
			}
			
		}
		
		return newList;
	}

	public static void main(String[] args) {
		
		
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));
		System.out.println(list);
		ArrayList<Integer> newList = removeDuplicates(list);
		System.out.println(newList);
	}

}
