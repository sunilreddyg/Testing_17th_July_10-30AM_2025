package com.bq.webdriver.BrowserOptions.Chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chrome_HeadLess {

	public static void main(String[] args) {
		
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");		
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://facebook.com");
		
		driver.findElement(By.id("email"));
		System.out.println("Email Identified");
		
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
