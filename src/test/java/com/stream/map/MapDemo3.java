package com.stream.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {

	public static void main(String[] args) {
		
		List<Integer> numbList = Arrays.asList(2,5,9,12);
		List<Integer> numList = new ArrayList<Integer>();
		
		numList = numbList.stream().map(num->num*3).collect(Collectors.toList());
		System.out.println(numList);
		numbList.stream().map(num->num*3).forEach(System.out::println);
		
		

	}

}
