package com.cogni;

public class ClassTest {
	
	
	int empid;
	String empName;
	double salary;
	String dept;
	
	
	
//	public ClassTest(int id,String name, double sal, String dpt)
//	{
//		empid = id;
//		empName = name;
//		salary = sal;
//		dept = dpt;
//		
//	}
	
	void setdata(int id,String name, double sal, String dpt)
	{
		empid = id;
		empName = name;
		salary  = salary;
		dept = dpt;
	}
	
	public void display()
	{
		System.out.println(empid);
		System.out.println(empName);
		System.out.println(salary);
		System.out.println(dept);
	}
	public static void main(String[] args) {

//		ClassTest ct = new ClassTest();
//		ct.empid=101;
//		ct.empName="Bipin Behera";
//		ct.salary=45500.50;
//		ct.dept="IT";
//		ct.display();
//		
		ClassTest ct1 = new ClassTest();
		ct1.setdata(102,"Paranti M",50060.70,"MyLearning");
		ClassTest ct2 = new ClassTest();
		ct2.setdata(103,"Bipin B",40060.70,"History");
		ct1.display();
		ct2.display();
	}

}
