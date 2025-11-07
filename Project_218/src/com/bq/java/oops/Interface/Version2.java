package com.bq.java.oops.Interface;

public class Version2 implements Original
{

	@Override
	public void title() 
	{
		System.out.println("I am Original");
		
	}

	@Override
	public void intro() 
	{
		System.out.println("Movie director");
		
	}

	@Override
	public void firsthalf() 
	{
		System.out.println("Visiting earth");
		
	}
	
	public static void main(String[] args) 
	{
		Original obj=new Version2();
		obj.title();
		obj.intro();
		obj.firsthalf();
		
	}

}
