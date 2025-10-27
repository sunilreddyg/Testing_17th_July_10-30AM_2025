package com.bq.webdriver.Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Selection_Dropdown {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
	
		By loc_DOBmonth=By.xpath("//select[@name='birthday_month']");
		WebElement MonthDD=driver.findElement(loc_DOBmonth);
		
		
		/*
		 * Creating Dropdown to multiple selection type
		 * using javascript executor
		 */
		((JavascriptExecutor)driver).executeScript
		("arguments[0].setAttribute('multiple','multiple')", MonthDD);
		Thread.sleep(5000);
		
		 
		//This method is designed to check dropdown is
		//single or multiple option type
		boolean flag=new Select(MonthDD).isMultiple();
		System.out.println(flag);
		
		if(flag)
		{
			//Selecting multiple options
			new Select(MonthDD).deselectAll();
			new Select(MonthDD).selectByIndex(1);
			new Select(MonthDD).selectByIndex(5);
			new Select(MonthDD).selectByIndex(11);
			
			//Deselecting dropdown option
			new Select(MonthDD).deselectByIndex(5);
		}


		/*
		 * Note:--> Deselection commands only work on
		 * 			multiple selection dropdown...
		 */
	}

}
