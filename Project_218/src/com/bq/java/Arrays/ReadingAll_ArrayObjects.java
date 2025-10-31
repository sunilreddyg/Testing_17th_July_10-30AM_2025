package com.bq.java.Arrays;

public class ReadingAll_ArrayObjects 
{

	public static void main(String[] args) 
	{
		
		
		String browsers[]= {"chrome","firefox","edge","ie"};
		//Reading array objects using foreach loop
		for (String string : browsers) 
		{
			System.out.println(string);
		}
		
		
		
		int num[]= {100,200,300,400};
		//Reading array objects using foreach loop
		for (int i : num) 
		{
			System.out.println(i);
		}
		
		
		
		//Group of string into array
		String urls[][]=
			{
					{"gmail","http://gmail.com"},
					{"yahoo","http://yahoomail.com"},
					{"facebook","http://facebook.com"},
			};
		
		//Reading double dimensional arry using foreach loop
		
		//Outter loop to read number of rows
		for (String[] url : urls) 
		{
			//Innerloop to read for number of cells
			for (String val : url) 
			{
				System.out.println(val);
			}
		}
		
		
		
	}

}
