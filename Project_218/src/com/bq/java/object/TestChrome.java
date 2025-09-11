package com.bq.java.object;

public class TestChrome 
{
	//Constructor
	public TestChrome() 
	{
		System.out.println("Chrome Is up and Ready to use");
		System.out.println("Visiting facebook site");
	}
	
	//Instant method
	public  void userlogin()
	{
		System.out.println("login completed");
	}
	
	//Instant method
	public  void userreg()
	{
		System.out.println("registration completed");
	}
	
	
	public static void main(String[] args) 
	{
		
		
			TestChrome chrome=new TestChrome();
			chrome.userreg();
			chrome.userlogin();
			
			/*
			 * Calling instant method using object creation
			 * Syntax:-->
			 * 
			 * 			Classname obj=new Classname();
			 * 			obj.methodname();
			 */
			
	}
	

}
