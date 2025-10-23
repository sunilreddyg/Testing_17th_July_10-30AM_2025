package com.bq.junit;


import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bq.webdriver.ScreenCapture.ScreenRepository;


class BeforeEach_And_AfterEach 
{
	WebDriver driver=null;
	
	
	@BeforeEach //Invoke every test before
	void setUp() throws Exception 
	{
		try {
			driver=new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		ScreenRepository srep=new ScreenRepository(driver);
		srep.capturescreenWithTime("scrn");
		Thread.sleep(5000);
		driver.quit();
	}

	
	String googleurl="http://google.com";
	@Test
	void verifygoogle() 
	{
		driver.get(googleurl);
		Assert.assertEquals(driver.getTitle(), "Google");
		System.out.println("Google Page Title Verified");
	}
	
	String urlfb="http://facebook.com";
	@Test
	void verifyfb() 
	{
		driver.get(urlfb);
		Assert.assertEquals("Facebook – log in or sign up", driver.getTitle());
		System.out.println("Fb title verified");
	}


}
