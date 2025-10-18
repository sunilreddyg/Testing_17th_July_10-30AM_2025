package com.bq.junit;


import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


class BeforeEach_And_AfterEach 
{
	WebDriver driver=null;
	String url="http://google.com";
	
	@BeforeEach //Invoke every test before
	void setUp() throws Exception 
	{
		try {
			driver=new ChromeDriver();
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		Thread.sleep(5000);
		driver.quit();
	}

	@Test
	void verifypagetitle() 
	{
		Assert.assertEquals(driver.getTitle(), "Google");
		System.out.println("Title is Verified");
	}

}
