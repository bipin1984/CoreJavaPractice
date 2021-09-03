package com.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {

	public static void main(String[] args) {
		
		
		List<Integer> number = Arrays.asList(23,45,6,789,34,23,78);
		Optional<Integer> velicle_collections = number.stream().reduce((value,combinedValue)->{return combinedValue+value;});
		System.out.println(velicle_collections.get());
		
		Object arr[] = number.stream().toArray();
		for(Object val:arr)
		{
			System.out.println(val);
		}
		
	
		

	}

}
