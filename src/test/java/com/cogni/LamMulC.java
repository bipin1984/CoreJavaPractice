package com.cogni;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
	
	String emp_name;
	int salary;
	int expr;
	Employee(String emp, int sal, int exp)
	{
		emp_name=emp;
		salary = sal;
		expr = exp; 
		
	}
	
}



public class LamMulC {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Bipin Behera", 120000, 14);
		Predicate<Employee> pr = e->(e.salary<45000 && e.expr<5);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("Suman priya",46000,6));
		al.add(new Employee("Pranati M",56000,8));
		al.add(new Employee("Gitanjali D",65000,10));
		al.add(new Employee("Umesh B",35000,4));
		for(Employee emp1:al)
		{
			if(pr.test(emp1))
				System.out.println("Empoyee Name: "+emp1.emp_name +" Salary: "+emp1.salary);
			
		}
		
		
		
	}

}
