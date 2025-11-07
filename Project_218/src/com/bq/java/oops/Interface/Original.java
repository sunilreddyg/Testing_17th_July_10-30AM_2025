package com.bq.java.oops.Interface;

public interface Original 
{
	void title();
	void intro();
	void firsthalf();
	
	default void method1() 
	{
		System.out.println("Default method executed");
	}
	
	
	static void method2()
	{
		System.out.println("static method executed");
	}

}
