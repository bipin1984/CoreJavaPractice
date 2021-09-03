package com.Intv;

public class RemoveWhileSpace {

	public static void main(String[] args) {
		
		String sentence = " Hello    India!!    This   is just a java test";
		System.out.println("String before replace "+sentence);
		sentence = sentence.replaceAll("\\s", "");
		System.out.println("String after replace "+sentence);
	}

}
