package com.cogni.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OneMoreFilter {

	public static void main(String[] args) {
		List<String> words = new ArrayList<String>(Arrays.asList("cup",null,"shops","markets","cycle",null,"book"));
		List<String >result = words.stream().filter(str->str!=null).collect(Collectors.toList());
		System.out.println(result);
		words.stream().filter(str->str!=null).forEach(System.out::println);
	}

}
