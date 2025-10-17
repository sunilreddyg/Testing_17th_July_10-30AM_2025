package com.bq.java.Exceptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Try_Catch {

	public static void main(String[] args) {
		
		
		try {
			//Try Error Code Here
		} catch (Exception e) {
			//Handle error here
		}
		
		
		WebDriver driver=null;
		try {
			
			driver=new ChromeDriver();   //ErrorCOde
			if (driver != null) 
			{
				driver.get("http://google.com");  //ErrorCode
				driver.manage().window().maximize();
			}
	
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Continued");
		
		
		

	}

}
