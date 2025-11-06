package com.bq.java.oops.inheritance;

public class ChildA extends Parent
{
	
	String email="info@gmail.com";

	public void method2()
	{
			method1();
			System.out.println(name);
	}
	
	public static void main(String[] args) 
	{
		//Creating object
		ChildA obj=new ChildA();
		obj.method1();    //From Parent class
		obj.method2();    //From ChildA class
		
		
		//Get only methods and everns from parent class
		Parent ref=new ChildA();
		ref.method1(); 
		System.out.println(ref.name);
		
	}

}
