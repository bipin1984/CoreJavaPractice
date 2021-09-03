package com.collection.stacks;

import java.util.Stack;

public class SearchElement {

	public static void main(String[] args) {
		Stack<String> stk = new Stack<String>();
		stk.push("Umesh");
		stk.push("Bipin");
		stk.push("Gita");
		stk.push("Pinki");
		stk.push("Suman");
		stk.push("Babu");
		
		System.out.println("Element Pinki Found " +stk.search("Pinki"));
		System.out.println("Element Alok is not Found " +stk.search("Alok"));
		
	}

}
