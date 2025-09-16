package com.bq.java.callbyreference;

public class Student1
{
	
	public Student1()
	{
		System.out.println("Student 1 Details Copied");
	}
	
	public String name="Sunil";
	public String email="sunilreddy.gajjala@gmail.com";
	public String mobile="9652680806";
	public static String Group="CSC";
	
	public void PrintDetails()
	{
		System.out.println(name);
		System.out.println(mobile);
	}
	
	public Certificate  Issue()
	{
		return new Certificate();
	}

}
