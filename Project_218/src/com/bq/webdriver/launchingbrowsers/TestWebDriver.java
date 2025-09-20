package com.bq.webdriver.launchingbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebDriver {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.phptravels.com/admin/login");
		driver.manage().window().maximize();
		
		
	    driver.findElement(By.id("email")).sendKeys("admin@phptravels.com");
	    driver.findElement(By.id("password")).sendKeys("demoadmin");
	    driver.findElement(By.id("submit")).click();

		
	}

}
