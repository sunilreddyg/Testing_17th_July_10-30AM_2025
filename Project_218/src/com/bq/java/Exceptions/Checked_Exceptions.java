package com.bq.java.Exceptions;

import java.awt.AWTException;
import java.awt.Robot;


public class Checked_Exceptions 
{
	
	//Checked Exception
	void methodA() throws InterruptedException, AWTException
	{
		Thread.sleep(5000);       //InterruptedException
		Robot robot=new Robot();  //AWTException
		
	}
	
	
	//Using Try-catch
	void methodB() 
	{
		Robot robot;
		try {
			Thread.sleep(5000);       //InterruptedException
			robot=new Robot();  //AWTException
		} catch (Exception e) {
			
		}
		
	}
	
	

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		
		Checked_Exceptions obj=new Checked_Exceptions();
		obj.methodA();
		obj.methodB();

	}

}
