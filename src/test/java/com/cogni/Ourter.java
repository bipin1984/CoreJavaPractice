package com.cogni;

public class Ourter {
	
	 public static class Inner
	 {
		 public void noneStatic()
		 {
			 System.out.println("None Static method inside static class");
		 }
	 }
	 
	 public class Inner1
	 {
		 public void func()
		 {
			 System.out.println("None static function inside none static class");
		 }
	 }

	 public static void main(String args[])
	 {
		 
		 Ourter.Inner inner1 = new Ourter.Inner();
		 inner1.noneStatic();
		 
		 Ourter outer = new Ourter();
		 
		 Ourter.Inner1 inner2 = new Ourter().new Inner1();
		 Ourter.Inner1 inner3 = outer.new Inner1();
		 
	 }
	 
}
