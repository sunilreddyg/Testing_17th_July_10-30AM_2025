package com.bq.java.methodparameters;
//Method overloading
public class CallByValue 
{
	//Method without parameter
	void methodA()
	{
		System.out.println("No Parameter");
	}
	
	//Method with String parameter
	void method1(String str) 
	{
		System.out.println(str);
	}
	
	//Method with int parameter
	void method2(int val) 
	{
		System.out.println(val);
	}
	
	//Method with double parameter
	void method3(double price)
	{
		System.out.println(price);
	}
	
	//Method with boolean parameter
	void method4(boolean flag)
	{
		System.out.println(flag);
	}
	
	//method with char parameter
	void method5(char ch)
	{
		System.out.println(ch);
	}

	public static void main(String[] args) 
	{
		CallByValue obj=new CallByValue();
		
		//Calling method without parameter
		obj.methodA();
		
		//Calling method with arguments
		obj.method1("iphone");
		obj.method2(5);
		obj.method3(45000.00);
		obj.method4(true);
		obj.method5('A');
		
		//Create new line at Console
		System.out.println("\n");
		
		obj.method1("samsung");
		obj.method2(3);
		obj.method3(55000.00);
		obj.method4(false);
		obj.method5('A');

	}

}
