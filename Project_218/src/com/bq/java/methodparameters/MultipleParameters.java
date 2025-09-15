package com.bq.java.methodparameters;

public class MultipleParameters 
{
	
	//Method with no parameter
	public void method1()
	{
		System.out.println("Method Don't have parameter");
	}
	
	//Method with single parameter
	public void method2(String name)
	{
		System.out.println(name);
	}
	
	//Method with Multiple Parameters
	public void method3(String name,double price)
	{
		System.out.println(name+"\t"+price);
	}
	
	//Method with Multiple Parameters
	public void method4(String name,int count,double price,boolean status)
	{
		System.out.println("Product Name:"+name);
		System.out.println("Product Num:"+count);
		System.out.println("Product Price:"+price);
		System.out.println("Product Status:"+status);
	}
	
	
	//Sequence parameters
	public void method5(String name,String description)
	{
		System.out.println(name+"\t"+description);
	}
	
	//Sequence parameters
	public void method6(int first,int  second)
	{
		int x=first;
		int y=second;
		System.out.println(x*y);
	}


	public static void main(String[] args) 
	{
		MultipleParameters obj=new MultipleParameters();
		
		//Calling without arguments
		obj.method1();
		
		//Calling method with single argument
		obj.method2("iphone");
		
		//Calling method with multiple parameters
		obj.method3("Samsung", 45000);
		obj.method4("Vivo", 2, 34000.00, true);
		
		
		obj.method5("Oppo", "64GB-Blue Color");
		obj.method6(10, 20);
	}

}
