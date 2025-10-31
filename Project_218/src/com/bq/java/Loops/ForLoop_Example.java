package com.bq.java.Loops;


public class ForLoop_Example {

	public static void main(String[] args) {
		
		
		//Print numbers 1 to 10
		for (int i = 1; i < 11; i++) 
		{
			System.out.println(i);
		}
		
		
		//Print numbers 10 to 1
		for (int i = 10; i > 0; i--) 
		{
			System.out.println(i);
		}
		
		
		//Read array values
		String browsers[]= {"chrome","firefox","edge","ie"};
		for (int i = 0; i < browsers.length; i++) 
		{
			System.out.println(browsers[i]);
		}
		
		
		//Sum between 1 to 100
		int sum=0;
		for (int i = 1; i <= 100; i++) 
		{
			sum=sum+i;
		}
		System.out.println("total value is --> "+sum);
		
		
		//How to reverse string
		String name="webdriver";
		char ch[]=name.toCharArray();
		String str="";
		for (int i = ch.length-1; i >= 0; i--) 
		{
			str=str+ch[i];
		}
		System.out.println("Resversed string is --> "+str);
		
		
		
		
		
	}

}
