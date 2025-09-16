package com.bq.java.callbyreference;

public class Student2 
{
	
	public Student2()
	{
		System.out.println("Student2 Details Copied");
	}
	
	private String name="Srinivas";
	private int age=26;
	private String mobile="900000000";
	
	public Certificate  Issue()
	{
		return new Certificate();
	}
}
