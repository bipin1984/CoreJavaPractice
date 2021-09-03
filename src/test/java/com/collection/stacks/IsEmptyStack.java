package com.collection.stacks;

import java.util.Stack;

public class IsEmptyStack {

	public static void main(String[] args) {
		
		Stack<String> stk = new Stack<String>();
		stk.push("Umesh");
		stk.push("Bipin");
		stk.push("Gita");
		stk.push("Pinki");
		stk.push("Suman");
		stk.push("Babu");
		
		System.out.println("Is the stck is empty :" +stk.empty());
		System.out.println("Is the stck is empty :" +stk.isEmpty());
		stk.pop();
		stk.pop();
		stk.pop();
		stk.pop();
		stk.pop();
		stk.pop();
		System.out.println("Is the stck is empty :" +stk.empty());
		System.out.println("Is the stck is empty :" +stk.isEmpty());
	}

}
