package com.bq.junit;


import java.time.Duration;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class BeforeAll_And_AfterAll {

	static WebDriver driver;
	@BeforeAll //It invoke one before all tests invoke
	static void setUpBeforeClass() throws Exception 
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterAll //it invoke once after all tests invoke
	static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.quit();
	}

	String urlfb="http://facebook.com";
	@Test
	void test1() 
	{
		driver.get(urlfb);
		Assert.assertEquals("Facebook – log in or sign up", driver.getTitle());
	}
	
	String urlgoogle="http://selenium.dev/";
	@Test
	void test2() 
	{
		driver.get(urlgoogle);
		Assert.assertEquals("Selenium", driver.getTitle());
	}

}
