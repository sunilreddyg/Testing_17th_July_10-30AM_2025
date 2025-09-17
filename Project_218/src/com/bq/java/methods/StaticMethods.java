package com.bq.java.methods;

public class StaticMethods 
{
	
	
	public static void methodA() 
	{
		System.out.println("Method A called");
	}
	
	public static void methodB() 
	{
		System.out.println("Method B called");
	}
	
	

	public static void main(String[] args) 
	{
		//With in class calling static methods from main method
		methodA();
		methodB();
		
		//Calling instant methods from other class
		new SampleMethods().methodA();
		
		//Outside class calling static methods from main method
		StaticMethods.methodA();
		StaticMethods.methodB();
		
		
		
	}

}
