package com.cogni.stream;

import java.util.HashSet;
import java.util.Set;

public class StreamMatch {

	public static void main(String[] args) {
		
		Set<String> fruits = new HashSet<String>();
		fruits.add("Two Apples");
		fruits.add("One Papya");
		fruits.add("Six Banana");
		fruits.add("Two Monagos");
		fruits.add("Two Kiwis");
		fruits.add("Nine Guava");
		
		boolean result = fruits.stream().anyMatch(value-> {return value.startsWith("Two");});
		System.out.println(result);
		
		boolean result1 = fruits.stream().allMatch(value-> {return value.startsWith("Two");});
		System.out.println(result1);
		
		boolean result2 = fruits.stream().noneMatch(value-> {return value.startsWith("two");});
		System.out.println(result2);
	}

}
