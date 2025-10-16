package com.bq.junit;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


class AssertNotEquals {

	@Test
	void example1() 
	{
		Assert.assertNotEquals(10, 17);
		System.out.println("Not Equals");
		
	}
	
	@Test
	void example2() 
	{
		Assert.assertFalse(10 > 20);
		System.out.println("COndition Accepted");
		
	}
	
	@Test
	void example3() 
	{
		WebDriver driver = new ChromeDriver();;
		Assert.assertNotNull(driver);
		System.out.println("Not null condition");
		driver.get("http://facebook.com");
		
	}
	

}
