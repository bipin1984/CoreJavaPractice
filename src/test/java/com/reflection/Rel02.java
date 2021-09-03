package com.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Rel02 {

	public static void main(String[] args) {
		
		Reflection01 rf = new Reflection01();
		
		Class clazz = rf.getClass();
		System.out.println(clazz.getSimpleName());
		
		Method[] methods = clazz.getDeclaredMethods();
		System.out.println(methods.length);
		for(Method met :methods)
		{
			System.out.println(met.getName()+"Return Type : "+met.getReturnType()+" Modifiers : "+met.getModifiers());
			Parameter[] params = met.getParameters();
			for(Parameter param:params)
			{
				System.out.println(param.getType());
			}
		}
		
		Constructor[] cons = clazz.getConstructors();
		System.out.println(cons.length);
		for(Constructor con :cons)
		{
			System.out.println(con.getName());
		}
				
		
	}
}
