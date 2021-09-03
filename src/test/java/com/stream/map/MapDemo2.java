package com.stream.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo2 {

	public static void main(String[] args) {
		List<String> vehicle = new ArrayList(Arrays.asList("bus","scooty","car","truck","van"));
		List<String> Uppervehicle = new ArrayList();
		
//		for(String vehi:vehicle)
//		{
//			System.out.println(vehi.length());
//			
//		}
//		
		//vehicle.stream().map(vehi_name->vehi_name.length()).forEach(name->System.out.println(name));
		vehicle.stream().map(vehi_name->vehi_name.length()).forEach(System.out::println);
		
		
		//vehicle.stream()
		
	

	}

}
