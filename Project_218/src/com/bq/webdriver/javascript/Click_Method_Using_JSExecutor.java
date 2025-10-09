package com.bq.webdriver.javascript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_Method_Using_JSExecutor {

	public static void main(String[] args) throws Exception
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(5000);
		
		
		//Enable javascript on automation browser
		WebElement CreateNewAccount=driver.findElement(By.linkText("Get a new Rediffmail ID"));
		
		//Default method to perform left click
		//CreateNewAccount.click();
		
		//Click Using Mouse interactions class
		//new Actions(driver).click(CreateNewAccount).perform();
		
		//Enable javascript executor at automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//Performing left click action at selected object using javascript
		js.executeScript("arguments[0].click()", CreateNewAccount);
		
	}

}
