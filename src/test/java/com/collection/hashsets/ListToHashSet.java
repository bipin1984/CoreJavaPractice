package com.collection.hashsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class ListToHashSet {

	public static void main(String[] args) {
		
		Integer ary[] = {75,45,90,76,84,69,58,79};
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(ary));
		
		HashSet hs = new HashSet(list);
		System.out.println(hs);
		hs.forEach(vale->System.out.println(vale));
		
		TreeSet treeSet = convert(ary);
		System.out.println("After Sorting of values :");
		treeSet.forEach(vale->System.out.println(vale));
	}

	private static TreeSet convert(Integer[] ary) {
		TreeSet treeSet = new TreeSet();
		for(int element: ary)
		{
			treeSet.add(element);
		}
		return treeSet;
	}
}
