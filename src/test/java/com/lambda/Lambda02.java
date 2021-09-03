package com.lambda;

interface Sayable
{
	public void say(String Name);
}

public class Lambda02 {

	public static void main(String[] args) {
		
		Sayable s = (name)->{System.out.println("Name of the employee is :" +name);};
		
		s.say("Bipin Behera");
		

	}

}
