package com.cog.System;

public class Env01 {

	public static void main(String[] args) {
		 // Get the value of
        // the TEMP environment variable
        System.out.println(System.getenv("TEMP"));
  
        // Get the value of
        // the OS environment variable
        System.out.println(System.getenv("OS"));
  
        // Get the value of
        // the JAVA_HOME environment variable
        System.out.println(System.getenv("JAVA_HOME"));

        System.out.println(System.getenv("browser"));
        
    	
	
			
			String browser = System.getenv("MAVEN_HOME");
			System.out.println(browser);
	
	}

}
