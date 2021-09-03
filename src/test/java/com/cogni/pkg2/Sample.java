package com.cogni.pkg2;

import com.cogni.pkg1.Home;

import com.cogni.pkg3.Testing;
import static com.cogni.pkg3.Testing.*;
public class Sample {

	public static void main(String[] args) {
		
		Test obj = new Test();
		obj.add();
		
		Home h= new Home();
		h.display();
		
		
		Test t= new Test();
		t.add();
		
		print();
		
		Testing t1= new Testing();
		t1.sum();
		
		

	}

}
