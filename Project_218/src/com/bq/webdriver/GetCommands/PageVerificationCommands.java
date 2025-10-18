package com.bq.webdriver.GetCommands;


import java.time.Duration;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bq.webdriver.ScreenCapture.ScreenRepository;

import utility.Repository;


class PageVerificationCommands {

	WebDriver driver;
	String Site1="https://demowebshop.tricentis.com/";
	
	@BeforeEach //Invoke before every test
	void setUp() throws Exception {
		driver=new ChromeDriver();
		driver.get(Site1);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@AfterEach   //Invoke after every test
	void tearDown() throws Exception {

		Thread.sleep(5000);
		driver.quit();
	}

	//@Test
	void verifypagetitle() {
		
		String ExpTitle="Demo Web Shop";
		Assert.assertEquals(ExpTitle, driver.getTitle());
		System.out.println("Expected title available");
	}
	
	//@Test
	void verifypageUrl() {
		driver.findElement(By.linkText("Register")).click();
		boolean flag=driver.getCurrentUrl().contains("/register");
		Assert.assertTrue(flag);
		System.out.println("Expected url available");
	}
	
	@Test
	void verifypagesource()
	{
		driver.findElement(By.linkText("Log in")).click();
		String PageSource=driver.getPageSource();
		
		//Checking object Id/Name presented at source
		Assert.assertTrue(PageSource.contains("Password"));
		System.out.println("Element Presented at source");
	}

}
