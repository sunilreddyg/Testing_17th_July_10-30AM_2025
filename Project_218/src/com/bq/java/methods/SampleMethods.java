package com.bq.java.methods;

//Class
public class SampleMethods 
{
	//InstantMethod
	public void methodA()
	{
		//statement
		System.out.println("MethodA Executed");
		System.out.println("TestSuccess");
	}
	
	//InstantMethod
	public void methodB() 
	{
		//Statement
		System.out.println("MethodB Executed");
	
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Run Started-----");
		
		//Calling Instant methods
		new SampleMethods().methodA();
		new SampleMethods().methodB();
		
		
	}
	
}
