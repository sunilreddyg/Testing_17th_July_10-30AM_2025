package com.bq.webdriver.objectidentification.classname;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class IdentifyWIth_ClassProperty {

	public static void main(String[] args)
	{
		
		WebDriver driver=new EdgeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		/*
		 * Identifying html objects using class property
		 * Note:-->	
		 * 		1. Make sure duplication of class before use it
		 * 	    2. Don't include spaces while defining class
		 */
		driver.findElement(By.className("inputtext")).sendKeys("Darshan");
		driver.findElement(By.className("_55r1")).sendKeys("abcd");
		
		
		
	}

}
