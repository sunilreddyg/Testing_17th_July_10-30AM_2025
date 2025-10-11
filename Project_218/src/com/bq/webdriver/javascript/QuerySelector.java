package com.bq.webdriver.javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuerySelector {

	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		Thread.sleep(5000);
		
		
		//Using Query selector [CssSelector]
		((JavascriptExecutor)driver)
		.executeScript("document.querySelector('#email').value='Darshan'");
		
		
	

	}

}
