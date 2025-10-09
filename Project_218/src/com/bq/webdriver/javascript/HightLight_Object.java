package com.bq.webdriver.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HightLight_Object {

	public static void main(String[] args) throws Exception 
	{
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(5000);
		
		
		//Enable Javascript executor at automation browser
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//Setting background color and Outline to Selected object
		WebElement ForgotPassword=driver.findElement(By.xpath("//a[contains(.,'Forgotten password?')]"));
		
		js.executeScript("arguments[0].style.backgroundColor ='yellow'", ForgotPassword);
		js.executeScript("arguments[0].style.outline = '5px solid blue'", ForgotPassword);
	}

}
