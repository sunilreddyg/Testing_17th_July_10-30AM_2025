package com.bq.java.oops.multiple_inheritence;

public class E extends C
{

	
	void m1()
	{
		method1();
		method2();
		method3();
	}
	
	public static void main(String args[])
	{
		C obj=new C();
		obj.method1();
		obj.method2();
		obj.method3();
	}
}
