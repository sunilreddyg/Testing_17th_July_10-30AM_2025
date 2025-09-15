package com.bq.java.methodparameters;

public class Calculator 
{
	//Global Declaration of variable
	int a;
	int b;

	
	//COnstructor with parameters
	public Calculator(int x, int y) 
	{
		a=x;
		b=y;
		//Assigning parameter values to global variable
	}
	
	public void add()
	{
		System.out.println(a+b);
	}
	
	public void sub()
	{
		System.out.println(a-b);
	}
	
	public void mul()
	{
		System.out.println(a*b);
	}

	public static void main(String[] args) 
	{
		new Calculator(10, 20).add();
		new Calculator(23, 5).mul();
		new Calculator(12, 6).sub();
		
		Calculator obj=new Calculator(20, 10);
		obj.add();
		obj.mul();
		obj.sub();
	}

}
