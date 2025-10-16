package com.bq.junit;


import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Assert_Equals 
{

	@Test
	void test() 
	{
		Assert.assertEquals("webdriver", "webdriver");
		System.out.println("Match Found");
	}
	
	@Test
	void NumberComparision() 
	{
		String Mobile="9030248855";
		Assert.assertEquals(10, Mobile.length());
		System.out.println("Valid Mobile Number");
	}
	
	
	
	@Test
	void VerifyTitle() 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		
		String Act_Title=driver.getTitle();
		String Exp_Title="Selenium";
		
		Assert.assertEquals(Exp_Title, Act_Title);
		System.out.println("Selenium dev page title verified");
	}

}
