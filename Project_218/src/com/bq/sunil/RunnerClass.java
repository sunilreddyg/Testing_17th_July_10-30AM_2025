package com.bq.sunil;


import com.bq.java.methods.CallingMethods;
import com.bq.java.object.TestChrome;
import com.bq.java.variables.types.TestData;

public class RunnerClass 
{

	public static void main(String[] args) 
	{
		CallingMethods obj=new CallingMethods();
		obj.methodA();
		obj.methodB();
		
		String fname=TestData.firstname;
		System.out.println(fname);
		
		System.out.println(TestData.mobile);
		
		TestChrome ch=new TestChrome();
		ch.userreg();
		
		
		
	}

}
