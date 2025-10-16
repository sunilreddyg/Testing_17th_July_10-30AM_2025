package com.bq.java.Coditions;



public class IF_ELSE {

	public static void main(String[] args) 
	{
		
		System.out.println("111");
		
		
		
		String name1="WebDriver";
		String name2="WebDriver";
		
		//Decision to verify both string are equal
		if (name1.equals(name2)) 
		{
			System.out.println("match Found");
		} 
		else 
		{
			System.out.println("Match not found");
		}
		
		
		
		System.out.println("333");
		

		
		//Not Equal with If-else
		if("12345".contains("23"))
		{
			System.out.println("Match found");
		}	
		else
		{
			System.out.println("Match not found");
		}
		
		//Age Validation
		int Age=19;
		if(Age > 18)
			System.out.println("valid age");
		else
			System.out.println("invalid age");
			
		
		
	}

}
