package com.bq.java.Coditions;

public class Variables_With_Conditions {

	public static void main(String[] args) {
		
		
		if(true)
		{
			String name="webdriver";  //Can't use outside if block
		}
		
		
		//Alway declare variable decison outside
		String toolname;  
		if(true)
		{
			toolname="webdriver";     
		}
		System.out.println(toolname);
		
		
		
		//Alway declare variable decison outside
		int val;
		if(true)
		{
			val=100;
		}
		System.out.println(val);
		
		

	}

}
