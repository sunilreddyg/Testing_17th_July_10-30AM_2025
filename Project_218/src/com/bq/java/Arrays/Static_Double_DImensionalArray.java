package com.bq.java.Arrays;

public class Static_Double_DImensionalArray 
{

	public static void main(String[] args) 
	{
		
		//String Double dimensional object
		String data[][]=new String[2][3];
		
		//1st row
		data[0][0]="Sunil";
		data[0][1]="9030248855";
		data[0][2]="MSC-ComputerScience";
		
		//2nd row
		data[1][0]="Srinivas";
		data[1][1]="9030546666";
		data[1][2]="Graduaction";
		
		String phonenum=data[0][1];
		System.out.println(phonenum);
		
		//Get length of array
		System.out.println(data.length); //Only Gives row number
		
				
		
		
		
	}

}
