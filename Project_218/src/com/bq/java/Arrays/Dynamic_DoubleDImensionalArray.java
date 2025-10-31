package com.bq.java.Arrays;

public class Dynamic_DoubleDImensionalArray {

	public static void main(String[] args) 
	{
		
		//Group of string into array
		String urls[][]=
			{
					{"gmail","http://gmail.com"},
					{"yahoo","http://yahoomail.com"},
					{"fabook","http://facebook.com"},
			};
		
		String yahoourl=urls[1][1];
		System.out.println(yahoourl);
		
		
		//Diffent Group of dataypes into arry
		Object obj[][]=
			{
					{"iphone",95000.00},
					{"Samsung",65000.00},
			};
		
		
		//Casting string object...
		double iphoneprice=(double)obj[0][1];
		System.out.println(iphoneprice);
		
		//Read length of the arry
		System.out.println("array lengt is ---> "+obj.length);
		
	}

}
