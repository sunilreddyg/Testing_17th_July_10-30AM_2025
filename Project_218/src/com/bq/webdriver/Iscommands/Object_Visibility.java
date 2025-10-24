package com.bq.webdriver.Iscommands;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Object_Visibility 
{
	
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
	
	
	By Loc_resume=By.xpath("//button[.='Upload Resume']");
	By Loc_exp=By.xpath("//div[@data-val='exp']");
	@Test
	public void CheckObjectVisibltAtWebpage() throws Exception
	{
		driver.get("https://www.naukri.com/registration/createAccount?");
		driver.findElement(Loc_exp).click();
		Thread.sleep(4000);
		
		boolean flag=false;
		try {
			flag=driver.findElement(Loc_resume).isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Assert.assertTrue(flag);
		System.out.println("Element Visible  at webpage");
	}

}
