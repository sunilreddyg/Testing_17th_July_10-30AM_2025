package com.bq.java.oops.polymorphism.overloading;

public class TestOverloading 
{
	//Methdod with no parameter
	public void methodA()
	{
		System.out.println("No Parameter");
	}
	
	//Overloading Method with String parameter
	public void methodA(String name)
	{
		System.out.println(name);
	}
	
	//Overloading Method with int parameter
	public void methodA(int num)
	{
		System.out.println(num);
	}
	
	//Overloading Method with double parameter
	public void methodA(double price)
	{
		System.out.println(price);
	}
	
	//Overloading Method with boolean parameter
	public void methodA(boolean status)
	{
		System.out.println(status);
	}
	
	//Overloading Method with char parameter
	public void methodA(char name)
	{
		System.out.println(name);
	}
	
	//Overloading Method with different parameters
	public void methodA(String name,int num)
	{
		System.out.println(name+"   "+(num));
	}
	
	//Overloading Method with different parameters
	public void methodA(int num,String name)
	{
			System.out.println((num)+"   "+name);
	}
		
	
	//Overloading Method with Sequence parameters 
	public void methodA(String name,String email)
	{
		System.out.println(name+"   "+email);
	}
	

	public static void main(String[] args) 
	{
		TestOverloading obj=new TestOverloading();
		obj.methodA();
		obj.methodA("OnePlus");
		obj.methodA(true);
		
	}

}
