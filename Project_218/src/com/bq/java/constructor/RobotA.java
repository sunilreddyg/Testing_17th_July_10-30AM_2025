package com.bq.java.constructor;



public class RobotA 
{
	//Class instance or Class constructor
	public RobotA() 
	{
		System.out.println("PowerOn");
	}
	
	
	//Instant method
	public void grabacup() 
	{
		System.out.println("Grab successful");
	}

	public static void main(String[] args) 
	{
		new RobotA().grabacup();

	}

}
