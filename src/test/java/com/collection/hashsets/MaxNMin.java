package com.collection.hashsets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class MaxNMin {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(76);
		hs.add(73);
		hs.add(84);
		hs.add(65);
		hs.add(93);
		hs.add(77);
		// Min and Max
		int max = Collections.max(hs);
		System.out.println(max);
		int min = Collections.min(hs);
		
		System.out.println(min);
		// Sorting of the elements
		
		List<Integer> list = new ArrayList<Integer>(hs);
		System.out.println("Before Sort");
		list.forEach(elements -> System.out.println(elements));
		Collections.sort(list);
		System.out.println("After Sort");
		list.forEach(elements -> System.out.println(elements));
		
	}

}
