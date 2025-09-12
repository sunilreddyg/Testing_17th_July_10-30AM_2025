package com.bq.java.variables.types;

public class FinalVariable 
{
	String email="sunil@gmail.com";
	//Do accept override value into variable
	
	final String pwd="9652680806"; 
	//Doesn't accept override value into variable

	public static void main(String[] args) 
	{
		
		FinalVariable obj=new FinalVariable();
		System.out.println(obj.email);
		obj.email="pranil@gmail.com";   //Override runtime values to variable
		System.out.println(obj.email);
		
		
		

	}

}
