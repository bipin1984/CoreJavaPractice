package com.cogni.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingStream {

	public static void main(String[] args) {
		
	List<Integer> sortedList = Arrays.asList(10,4,3,18,45,23,5);	
	List<Integer> sortlist = sortedList.stream().sorted().collect(Collectors.toList());
	System.out.println(sortlist);
		
	
	List<Integer> Revsortlist = sortedList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	
	System.out.println(Revsortlist);
	
	List<String> sortedNames = Arrays.asList("Bipin","Suman","Babu","Pinki","Umesh","Gita");
	List<String> sortnames = sortedNames.stream().sorted().collect(Collectors.toList());
	System.out.println(sortnames);
	
	List<String> Revsortnames = sortedNames.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println(Revsortnames);
	
	
	
	

	}

}
