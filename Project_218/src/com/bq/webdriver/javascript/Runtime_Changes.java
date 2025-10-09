package com.bq.webdriver.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Changes {

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		
		
		//Enable javascript execution at automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		Thread.sleep(4000);

		
		WebElement Email=driver.findElement(By.id("email"));
		
		
		//Hide object from webpage
		js.executeScript("arguments[0].style.visibility='hidden'", Email);
		Thread.sleep(2000);
		
		//Get Object to Visible
		js.executeScript("arguments[0].style.visibility='visible'", Email);
		Thread.sleep(2000);
		
		//Disable object  from user actions
		js.executeScript("arguments[0].disabled=true", Email);
		Thread.sleep(10000);
				
		//Enable Object 
		js.executeScript("arguments[0].disabled=false", Email);
		Thread.sleep(2000);
		
		
		
		
	}

}
