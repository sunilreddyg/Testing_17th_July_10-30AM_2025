package com.bq.webdriver.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_And_Remove_Attributes {

	public static void main(String[] args) throws Exception 
	{
		
		

		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		
		//Enable javascript execution at automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		Thread.sleep(4000);

				
		WebElement Email=driver.findElement(By.id("email"));

		//Remove attribute
		js.executeScript("arguments[0].removeAttribute('placeholder')", Email);
		
		//Add attribute
		js.executeScript("arguments[0].setAttribute('placeholder','Welcome Sunil')", Email);
		
		
		
	}

}
