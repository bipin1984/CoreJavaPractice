
package com.stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMax {

	public static void main(String[] args) {
		
		List<Integer> numList = Arrays.asList(3,10,5,6,23,56,39,12,7,69,40,32);
		long cnt = numList.stream().filter(n->n%2==0).count();
		System.out.println(cnt);
		
		Optional <Integer> min = numList.stream().min((val1,val2)->{return val1.compareTo(val2);});
		System.out.println(min.get());
		
		Optional <Integer> max = numList.stream().max((val1,val2)->{return val1.compareTo(val2);});
		System.out.println(max.get());
		
		}
		
	}


