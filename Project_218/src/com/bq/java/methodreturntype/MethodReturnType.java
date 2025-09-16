package com.bq.java.methodreturntype;


public class MethodReturnType 
{
	
	public void method1()
	{
		String tname="Webdriver";
		//Void method doesn't return any value
		//Anything under void method it runs and don't return value
	}
	
	
	/*
	 * Insted of void we can define Datatype and Classes
	 * Other than void all alltypes return values to methodname
	 * We should write return keyword at the end of method.
	 */
	public String method2()
	{
		String tool="selenium";
		return tool;
	}
	
	
	//Method with integer return type
	public int add(int a, int b)
	{
		return a+b;
	}
	
	
	//method with boolean retur type
	public boolean AgeValidation(int age)
	{
		if (age >= 18) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	
	}
	
	
	//Method with double return type
	public double getprice()
	{
		double price=24000.90;
		return price;
	}
	
	//Method with char return type
	public char method3()
	{
		return 'A';
	}
	

	public static void main(String[] args) 
	{
		MethodReturnType obj=new MethodReturnType();
		
		//Calling void method
		obj.method1();
		
		//Calling String return method
		String val=obj.method2();
		System.out.println(val);
		
		//Calling integer return method
		int total=obj.add(10, 20);
		System.out.println(total);
		
		//Calling boolean return method
		boolean flag=obj.AgeValidation(12);
		System.out.println(flag);
		
		//Calling double return method
		double price=obj.getprice();
		System.out.println(price);

	
		
	}

}
