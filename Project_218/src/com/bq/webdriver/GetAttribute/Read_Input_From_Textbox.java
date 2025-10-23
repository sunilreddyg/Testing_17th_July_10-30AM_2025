package com.bq.webdriver.GetAttribute;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Input_From_Textbox 
{
	
	String url="https://www.facebook.com/";
	By email=By.xpath("//input[@id='email']");
	
	@Test
	public void ReadInputFromTxtBox()
	{
		driver.get(url);
		WebElement ObjEmail=driver.findElement(email);
		ObjEmail.sendKeys("Darshan");   //Typing text into entrybox
		
		//Read input from entrybox
		String input=ObjEmail.getAttribute("value");
		System.out.println("Retrived value is:--> "+input);
	}
	
	
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
	

}
