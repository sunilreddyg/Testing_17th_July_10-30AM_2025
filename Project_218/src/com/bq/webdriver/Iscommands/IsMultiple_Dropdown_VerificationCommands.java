package com.bq.webdriver.Iscommands;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultiple_Dropdown_VerificationCommands {

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
	 * Example:--> How to Check Requied Dropdown Option
	 * 				is Selected At dropdown..
	 */
	
	By MonthDOB=By.xpath("//select[@name='birthday_month']");
	
	
	@Test
	public void CheckFirstSelectedObject_At_Dropdown()
	{
		driver.get("https://www.facebook.com/r.php?");
		
		//Checking Default Oct Method Optin Displayed at Month dropdown
		WebElement Reg_monthdd=driver.findElement(MonthDOB);
		new Select(Reg_monthdd).selectByVisibleText("Jan");
		
		//Reading select Option value at dropdown..
		String Option=new Select(Reg_monthdd).getFirstSelectedOption().getText();
		System.out.println(Option);
	}
	
	
	
	

}
