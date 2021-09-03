package com.collection.hashMaps;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CustomKey {
	
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	private long id;   
    private String name;   
    private Date dateOfBirth;    
    private BigDecimal salary;   
    //Getter and Setters
    // toString

    public static void main(String args[])
    {
    	HashMap<CustomKey,String> employeeMap = new HashMap<CustomKey,String>();  

    	CustomKey employee1 = new CustomKey();    
        employee1.setId(1);    
        employee1.setName("Sachin");    
        employee1.setDateOfBirth(new Date(1987,2,1));    
        employee1.setSalary(new BigDecimal(100000));    

        employeeMap.put(employee1,"India");    

        // Some Business logic    
        // In the second Operation I am updating the same employee with the newly initailized Employee Object

        CustomKey employee2 = new CustomKey();    
        employee2.setId(1);    
        employee2.setName("Sachin");    
        employee2.setDateOfBirth(new Date(1987,2,1));    
        employee2.setSalary(new BigDecimal(100000));  

        // Here we wanted to update the same Employee to Japan
        employeeMap.put(employee2,"Japan");    
        for(Map.Entry<CustomKey,String> pair:employeeMap.entrySet() )
        {
        	System.out.println(pair.getKey().getName());
        }
        //System.out.println(employeeMap.keySet().employee1.name.toString())); 
    }
    
}
