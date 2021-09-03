package com.Intv;

public class RemoveJungSPLchar {

	public static void main(String[] args) {
		
		String sentence = " Hello  ##$$%India!!    This   is just @java test";
		System.out.println("Before: "+sentence);
		sentence = sentence.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("After: "+sentence);
	}

}
