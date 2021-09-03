package com.cogni.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student
{
	String name;
	int score;
	
	Student(String StName,int Stscore)
	{
		this.name = StName;
		this.score = Stscore;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getScore()
	{
		return this.score;
	}
	
	
	
}



public class ParallelStream {

	public static void main(String[] args) {
	List<Student> students = Arrays.asList( new Student("Bipin Behera",78),
											new Student("Suman Behera",98),
											new Student("Pranati M",88),
											new Student("Umesh Behera",77),
											new Student("Gita Das",68));

	
	students.stream().filter(std->std.score>70).limit(3).forEach(std->System.out.println(std.getName()+":"+std.getScore()));

	students.parallelStream().filter(std->std.score>70).limit(3).forEach(std->System.out.println(std.getName()+":"+std.getScore()));

	}		
			
}
