package com.bq.java.variables.Initiation;

public class TestA 
{
	//Declaration of variable
	int a;
	int b;
	int c;
	
	void methodA()
	{
		a=100;
		b=200;
		c=300;
	}
	void methodB()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	

	public static void main(String[] args) 
	{
		TestA obj=new TestA();
		
		System.out.println(obj.a);
		
		obj.methodA();
		obj.methodB();
		System.out.println(obj.a);
		
		//Override data into variable
		obj.a=10000;
		System.out.println(obj.a);


	}

}
