package com.cogni;

@FunctionalInterface
interface Cab{
	public void bookcab();
}


public class LamExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * lambda express in java use to bring the functional programming to
		 * java
		 * 
		 * 
		 * 
		 * 
		 * */
		Cab cab =()-> System.out.println("This is Lambda expression to book a cab!!");
		cab.bookcab();
		

	}

}
