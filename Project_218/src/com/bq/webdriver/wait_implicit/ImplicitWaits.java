package com.bq.webdriver.wait_implicit;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaits {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts()
		//wait for until object load at Document Object Model
		.implicitlyWait(Duration.ofSeconds(10))
		
		//Wait for until all page object to load
		.pageLoadTimeout(Duration.ofSeconds(200))
		
		//Wait for until all external scripts into current page
		.scriptTimeout(Duration.ofSeconds(200));
		
		

	}

}
