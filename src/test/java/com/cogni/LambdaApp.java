package com.cogni;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class NewEmployee
{
	String ename;
	int salary;
	public NewEmployee(String empName,int sala)
	{
		this.ename= empName;
		this.salary=sala;
	}
	
	
}

public class LambdaApp {

	public static void main(String[] args) {
		
		ArrayList<NewEmployee> ar = new ArrayList<NewEmployee>();
		
		ar.add(new NewEmployee("Bipin Behera",25000));
		ar.add(new NewEmployee("Suman Priya",35000));		
		ar.add(new NewEmployee("Pranati M",45000));
		ar.add(new NewEmployee("Umesh B",65000));
		
		
		Function<NewEmployee,Integer> fn=e->{
			int sal=e.salary;
			
			if(sal>=25000 && sal<=34000)
				return (sal*10/100);
			else if(sal>=35000 && sal<=44000)
				return (sal*20/100);
			else if(sal>=45000 && sal<=65000)
				return (sal*30/100);
			else return (sal*40/100);
			};
			
			Predicate<Integer> p = b->b>10000;
			
			for(NewEmployee emp:ar)
			{
				
				int bonus = fn.apply(emp);
				if(p.test(bonus))
				{
					System.out.println("Employee Name:"+emp.ename+" , "+"Empoyee Salary:"+emp.salary);
					System.out.println("Bonus is :"+bonus);
				}
				
			}
	}

}
