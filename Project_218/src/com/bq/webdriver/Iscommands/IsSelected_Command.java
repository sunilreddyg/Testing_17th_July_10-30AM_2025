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

class IsSelected_Command {

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
	
	By Fem_rbtn=By.xpath("//input[@type='radio'][@value='1']");
	
	//@Test
	public void CheckingRadiobuttonSelectionStatus()
	{
		driver.get("https://www.facebook.com/r.php?");
		//Check Radio button is Unchecked
		boolean flag=driver.findElement(Fem_rbtn).isSelected();
		if(flag==false)
			System.out.println("Object is not selected");
		else
			System.out.println("Object is selected");
	}
	
	@Test
	public void CheckingRadiobuttonStatus()
	{
		driver.get("https://www.facebook.com/r.php?");
		driver.findElement(Fem_rbtn).click();
		
		//Check Radio button is Checked
		boolean flag=driver.findElement(Fem_rbtn).isSelected();
		if(flag)
			System.out.println("Object is  selected");
		else
			System.out.println("Object is not selected");
	}
	

}
