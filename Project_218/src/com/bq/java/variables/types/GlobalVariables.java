package com.bq.java.variables.types;

public class GlobalVariables 
{
	//Global Variable :--> The variable declared outside of the method
	//and inside of the class
	String name="Sunil";
	int val=100;
	
	void add()
	{
		System.out.println(val+10);
	}
	
	void sub()
	{
		System.out.println(val-10);
	}
	
	void mul()
	{
		System.out.println(val*10);
	}
	
	static void getcount()
	{
		//In order to call instant variable inside static method
		int total=new GlobalVariables().val;
		System.out.println(total+100);
	}
	

	public static void main(String[] args)
	{
		GlobalVariables obj=new GlobalVariables();
		obj.add();
		obj.sub();
		obj.mul();
		
		/*
		 * Note:--> By Creation of object we can call
		 * 			global variable outside of the class..
		 * 			similar to methods
		 */
		String x=obj.name;
		System.out.println(x);
		
		int y=obj.val;
		System.out.println(y+100);

	}

}
