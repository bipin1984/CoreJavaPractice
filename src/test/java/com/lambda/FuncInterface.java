package com.lambda;



public class FuncInterface {

	public static void main(String[] args) {
		// approach 1
//		FunctionalInterface f1 = new FunctionalInterface() {
//			public void show() {
//				System.out.println("hello lambda!");
//			}
//		};
//		f1.show();
//	
		// approach 2
//		new FunctionalInterface()
//		{
//			@Override
//			public void show()
//			{
//				System.out.println("hello lambda");
//			}
//		}.show();
//	
		FunctionalInterface f1 = () -> {System.out.println("hello lambda!");};
		f1.show();
	}

}
