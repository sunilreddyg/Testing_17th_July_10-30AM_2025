package com.bq.webdriver.BrowserOptions.Chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Start_Maximize {

	public static void main(String[] args) throws Exception {


		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");		
		options.addArguments("--incognito");
		options.addArguments("--disable-extensions");
		
		
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://facebook.com");
		Thread.sleep(5000);
		
		driver.findElement(By.id("email"));
		System.out.println("Email Identified");
		
		System.out.println(driver.getTitle());
		driver.quit();
	}

}


