package com.bq.webdriver.Iscommands;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Object_Enabled_Or_Disabled 
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
		//driver.quit();
	}
	
	
	By Loc_reg_btn=By.xpath("//button[@type='submit']");
	//@Test
	public void CheckingObjectDisabledAtPage() throws Exception
	{
		driver.get("https://www.naukri.com/registration/createAccount?");
		
		if(!(driver.findElement(Loc_reg_btn).isEnabled()))
			System.out.println("Object is disabled");
		else
			System.out.println("Object is enabled");
	}
	
}
