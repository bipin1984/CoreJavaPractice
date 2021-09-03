package com.collection.arrayList;

import java.util.ArrayList;
import java.util.List;

public class UpdateArrayList {

	public static void main(String[] args) {
		
		List<Integer> marks = new ArrayList<Integer>();
		marks.add(96);
		marks.add(86);
		marks.add(67);
		marks.add(92);
		marks.add(85);
		marks.add(90);
		int replacedMark = marks.set(2,79);
		
		System.out.println(marks);
		System.out.println(replacedMark);
		
		// Remove an element
		
		marks.remove(3);
		System.out.println(marks);
		

	}

}
