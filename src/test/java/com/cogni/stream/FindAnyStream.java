package com.cogni.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyStream {

	public static void main(String[] args) {
		
		List<String> stringList = Arrays.asList("one","five","three","nine");
		Optional as = stringList.stream().findAny();
		System.out.println(as.get());
		
		Optional ff = stringList.stream().findFirst();
		System.out.println(ff.get());
		
	}

}
