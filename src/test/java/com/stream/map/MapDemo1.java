package com.stream.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

	public static void main(String[] args) {
	
		List<String> vehicle = new ArrayList(Arrays.asList("bus","scooty","car","truck","van"));
		List<String> Uppervehicle = new ArrayList();
		
//		for(String vehi:vehicle)
//		{
//			Uppervehicle.add(vehi.toUpperCase());
//		}
//		
		//System.out.println(Uppervehicle);
		Uppervehicle = vehicle.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		System.out.println(Uppervehicle);
	}

}
