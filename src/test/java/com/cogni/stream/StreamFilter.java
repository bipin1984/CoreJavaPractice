package com.cogni.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

	public static void main(String[] args) {
		
		
		List<Integer> numList = new ArrayList(Arrays.asList(20,39,45,86,12,40));
		List<Integer> evenNum = new ArrayList<Integer>();
//		for(int even:numList)
//		{
//			if (even%2==0)
//			{
//				evenNum.add(even);
//			}
//			
//		}
//		System.out.println(evenNum);

		
		evenNum= numList.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNum);
		evenNum.forEach(n->System.out.println(n));
		numList.stream().filter(n->n%2==0).forEach(System.out::println);
		
	}

}
