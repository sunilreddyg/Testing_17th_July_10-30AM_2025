package com.bq.java.variables.types;

public class LocalVariable 
{
	 void method1()
	{
		int a=100;
		System.out.println(a+10);
		System.out.println(a-10);
		System.out.println(a*10);
	}
	 
	 void method2()
	{
		int a=200;
		System.out.println(a+10);
		System.out.println(a-10);
		System.out.println(a*10);
	}
	
	

	public static void main(String[] args) 
	{
		LocalVariable obj=new LocalVariable();
		obj.method1();
		obj.method2();

	}

}
