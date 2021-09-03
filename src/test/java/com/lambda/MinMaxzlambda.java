package com.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinMaxzlambda {

	public static void main(String[] args) {
	
		List<Integer> list = Arrays.asList(3,10,5,6,23,56,39,12,7,69,40,32);
		list.forEach(n -> System.out.println(n));
		list.forEach(n -> {if (n%2==0) System.out.println(n);});

	}

}
