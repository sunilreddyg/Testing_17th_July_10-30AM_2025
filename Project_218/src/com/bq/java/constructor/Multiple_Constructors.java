package com.bq.java.constructor;

public class Multiple_Constructors 
{

	public Multiple_Constructors() 
	{
		System.out.println("Run WIthout parameter");
	}
	
	public Multiple_Constructors(String name) 
	{
		System.out.println("Run with Parameter:--> "+name);
	}
	
	public static void main(String[] args) {
		new Multiple_Constructors();
		new Multiple_Constructors("chrome");
		
		
		
	}

}
