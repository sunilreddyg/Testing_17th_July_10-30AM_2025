package com.bq.java.methodparameters;

import java.util.Calendar;
import java.util.Date;

public class CallByReference 
{
	//CallByvalue :--> Pass datatypes as parameter
	public void print(String time)
	{
		System.out.println(time);
	}
	
	
	//CallByreference:--> Pass Classes as parameter
	public void getCurrentSystemDate(Date d)
	{
		System.out.println(d.toString());
	}
	
	
	public static void main(String[] args) 
	{
		CallByReference obj=new CallByReference();
		obj.print("12:08");
		
		
		Date date=new Date();
		obj.getCurrentSystemDate(date);
		obj.getCurrentSystemDate(new Date());
		
		

	}

}
