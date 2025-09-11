package com.bq.java.constructor;


public class HoldClutch 
{
	
	public HoldClutch() 
	{
		System.out.println("Holding Clutch");
	}
	
	public void changetofirstgear() 
	{
		System.out.println("First Gear changed");
	}
	
	public void changetoSecondgear() 
	{
		System.out.println("Second Gear changed");
	}
	

	public static void main(String[] args) 
	{
			//Creating object to call instant methods
			new HoldClutch().changetofirstgear();
			new HoldClutch().changetoSecondgear();
			
			/*
			 * Object Creation syntax
			 * 		Classname obj=new Classname();
			 * 		obj.methodname();
			 */
			HoldClutch obj=new HoldClutch();
			obj.changetofirstgear();
			obj.changetoSecondgear();

	}

}
