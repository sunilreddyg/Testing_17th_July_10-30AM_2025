package com.bq.java.variables;

public class DataTypes 
{

	
	public static void main(String[] args) 
	{
		
		/*
		 * byte:-->
		 * 			=> byte is a numeric datatype
		 * 			=> Default value is 0
		 * 			=> Min value is -128  
		 * 			=> Maximum value is 127
		 */
		byte a=127;
		System.out.println("byte value is -> "+a);
		
		/*
		 * int:-->
		 * 		=>  int is a numeric datatype
		 * 		=>  Default value is 0
		 * 		=> Recomended always int to store numeric values
		 */
		int x=100;
		int y=200;
		int z=x+y;  //Here + Work like operator conducting addition between two number
		System.out.println("total value is "+z);
		System.out.println(a+z+10);
		
	
		/*
		 * boolean:-->
		 * 			=> boolean store true/false value
		 * 			=> default value of boolean is false
		 */
		boolean flag=true;
		boolean status=false;
		System.out.println("flag value is -> "+flag);
		System.out.println("flag value is ->"+status);
		
		
		/*
		 * double:-->
		 * 		=> Double accept decimal values to store
		 * 		=> Default value of double is 0
		 */
		double selenium_version=3.149;
		double price=25000.50;
		double newprice=100;
		System.out.println("Version is --> "+selenium_version);
		System.out.println("Price is --> "+price);
		System.out.println(newprice);
		
		
		/*
		 * float:-->
		 * 		=> Float accept decimal values same as double
		 * 		=> Float value should end with f character
		 * 		=> default value is 0
		 */
		float f=1234.67f;
		System.out.println("float value is ---> "+f);
		
		
		/*
		 * char:-->
		 * 			=> Accept only sigle character
		 * 			=> Only store single character in single quotes
		 * 			=> Default value is null
		 */
		char group1='A';
		char group2='B';
		System.out.println("group value is -->"+group1);
		System.out.println("group1 value is -->"+group2);
		
		
		/*
		 * String:-->
		 * 			=> String is a non-primitive datatype
		 * 			=> String starts with Uppercase characters
		 * 			=> String allow to store set of characters
		 * 			=> String data stored in double quotes
		 * 			=> Default value is null.
		 * 			=> string also called as class because it contains
		 * 				set of events.
		 */
		String name="Mindq";
		String email="info.dsnr@mindqsystems.com";
		String mobile="9030248855";
		
		System.out.println(name+email+mobile);
		//Printing with escape sequence TAB
		System.out.println(name+"\t"+email+"\t"+mobile);
		//Printing with escape sequence NEWLINE
		System.out.println(name+"\n"+email+"\n"+mobile);
		
		/*
		 * Java escape sequences
		 * Escape Sequence	Description
				\n	Inserts a new line
				\t	Inserts a tab
				\b	Inserts a backspace
				\r	Inserts a carriage return
				\'	Inserts a single quote
				\"	Inserts a double quote
				\\	Inserts a backslash
				\f	Inserts a form feed

		 */
	
		/*
		 * Arrays:-->
		 * 		Array Store set of values
		 */
		int num[]= {100,200,300};
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		
		
		
		
		
		
	}

}
