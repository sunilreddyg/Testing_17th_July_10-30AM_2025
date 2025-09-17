package com.bq.java.methods;

public class CallingMethods 
{
	//Instant method
	public void methodA() 
	{
		System.out.println("Method A called");
	}
	
	//Instant method
	public void methodB()
	{
		System.out.println("Method B Called");
	}
	
	//Instant method
	void methodC()
	{
		//Calling instant methods with in class
		methodA();
		methodB();
		System.out.println("Method C called");
	}
	
	//static method
	public static void methodD()
	{
		//Calling instant methods inside static method
		new CallingMethods().methodA();
		new CallingMethods().methodB();
		System.out.println("Method D called");
	}
	
	
	public static void main(String[] args) 
	{
		//Calling instant method from static specifier method
		new CallingMethods().methodC();
		
		//Calling static method
		methodD();
	}
	

}
