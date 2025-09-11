package com.bq.java.variables.types;

public class StaticType 
{
	
	static int a=100;
	static double price=25000.00;
	static boolean flag=true;
	
	
	void method1()
	{
		System.out.println(a+100);
		System.out.println(price);
		System.out.println(flag);
		System.out.println(TestData.mobile);
	}
	
	void method2()
	{
		
	}

	public static void main(String[] args) 
	{
		StaticType obj=new StaticType();
		obj.method1();
		
		
		//Calling Static Global variables
		int x=StaticType.a;
		double y=StaticType.price;
		boolean z=StaticType.flag;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
			
	}

}
