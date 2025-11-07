package com.bq.java.oops.Abstract;

public abstract class Shape 
{
	
	static String name="MQ";
	
	abstract void draw();      //Abstract method
	
	void corners()             //Default mehtod
	{
		System.out.println("Corners:--> ");
	}
	
	//Static method
	static void Capture()
	{
		System.out.println("Captured");
	}
	
}
