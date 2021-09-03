package com.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctCountLimit {

	public static void main(String[] args) {
		
		List<String> vehicle = Arrays.asList("car","bus","truck","van","tempo","bike","car","bike","van");
		List<String> vehi = vehicle.stream().distinct().collect(Collectors.toList());
		System.out.println(vehi);
		
		long count = vehicle.stream().distinct().count();
		System.out.println(count);
		
		List<String> vehi_list =  vehicle.stream().limit(4).collect(Collectors.toList());
		System.out.println("Vehicle List "+vehi_list);
		
		vehicle.stream().limit(4).forEach(System.out::println);
		
		
		
	}

}
