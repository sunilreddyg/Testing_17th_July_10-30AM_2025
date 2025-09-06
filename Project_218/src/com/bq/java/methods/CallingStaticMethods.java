package com.bq.java.methods;

public class CallingStaticMethods
{
	//static specifier method
	static void methodA()
	{
		System.out.println("MethodA called");
	}
	
	
	//static specifier method
	static void methodB()
	{
		System.out.println("MethodB called");
	}
	
	//Instant method
	void methodC()
	{
		/*
		 * Static methods are super users it will allow
		 * any non static methods to call without help 
		 * of object creation..
		 */
		methodA();
		methodB();
		System.out.println("MethodC called");
	}
	
	public static void main(String[] args) 
	{
		//Calling instant method from static specifier method
		new CallingStaticMethods().methodC();
	}

}
