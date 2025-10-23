package com.bq.webdriver.GetAttribute;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Validation 
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
	
	
	/*
	 * Testcase:-->
	 * 	1. Navigate to  https://in.trip.com/?
	 *  2. Check Current system date displayed at Check In Entrybox
	 */
	
	String url="https://in.trip.com/?";
	By locCheckin=By.xpath("//input[@id='checkInInput']");
	@Test
	public void CheckinDateValidation()
	{
		driver.get(url);
		
		//Read Current System Date and convert into required format
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("EEE, MMM dd");
		String Exp_Date=sdf.format(d);
		
		//Read input from entrybox
		String Act_Date=driver.findElement(locCheckin).getAttribute("value");
		
		if(Act_Date.equalsIgnoreCase(Exp_Date))
			System.out.println("Date Verified");
		else
			System.out.println("Date not verified");
		
	}
	

}
