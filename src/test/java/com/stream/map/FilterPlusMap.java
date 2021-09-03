package com.stream.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
	int id;
	String name;
	int salary;
	
	public Employee(int empId,String empName,int empSal)
	{
		this.id= empId;
		this.name=empName;
		this.salary=empSal;
	}
	
}



public class FilterPlusMap {

	public static void main(String[] args) {
		
		List<Employee> empList = Arrays.asList(
				new Employee(1,"Bipin Behera",25000),
				new Employee(2,"Suman Behera",35000),
				new Employee(3,"Pranati Behera",45000),
				new Employee(4,"Umesh Behera",55000),
				new Employee(5,"Gitanjali Behera",65000),
				new Employee(5,"Gitanjali Behera",55000),
				new Employee(5,"Gitanjali Behera",65000)
				);
		
//		empList.add(new Employee(1,"Bipin Behera",25000));
//		empList.add(new Employee(2,"Suman Behera",35000));
//		empList.add(new Employee(3,"Pranati Behera",45000));
//		empList.add(new Employee(4,"Umesh Behera",55000));
//		empList.add(new Employee(5,"Gitanjali Behera",65000));
		
		
//		List<Integer> emp_sal = empList.stream().filter(emp->emp.salary>35000).map(emp->emp.salary).collect(Collectors.toList());
//		System.out.println(emp_sal);
		
		List<Integer> dis_sal1 =  empList.stream().map(emp->emp.salary).distinct().collect(Collectors.toList());
		System.out.println(dis_sal1);
		dis_sal1.forEach(sal->System.out.println(sal));
		
		
	}

}
