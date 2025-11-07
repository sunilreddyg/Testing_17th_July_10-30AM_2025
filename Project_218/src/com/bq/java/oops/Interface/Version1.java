package com.bq.java.oops.Interface;

public class Version1 implements Original
{

	@Override
	public void title() 
	{
		System.out.println("The Originals");
		
	}

	@Override
	public void intro() 
	{
		System.out.println("Actor is a tea seller");
		
	}

	@Override
	public void firsthalf() 
	{
		System.out.println("Other Plannet");
		
	}
	
	public void locations()
	{
		System.out.println("inner Space");
	}
	
	public static void main(String[] args) 
	{
		Original obj=new Version1();
		obj.title();
		obj.intro();
		obj.firsthalf();
		obj.method1();
	}

}
