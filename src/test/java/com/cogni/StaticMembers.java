package com.cogni;

public class StaticMembers {

	int x;
	static int y;
	 void A() {
		 System.out.println("None Static Member Access!"+y);
	 }
	 
	 static void B() {
		 System.out.println("Static Member Access!");
	 }
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticMembers sm = new StaticMembers();
		sm.x = 10;
		System.out.println(sm.x);
		sm.y=200;
		StaticMembers.y=300;
		StaticMembers.B();
		sm.B();
		}

}
