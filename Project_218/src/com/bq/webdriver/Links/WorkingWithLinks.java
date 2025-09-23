package com.bq.webdriver.Links;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithLinks {

	public static void main(String[] args) {
		
		//Browser UP and loading webpage
		String URL="https://www.facebook.com/";
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on Singup link
		driver.findElement(By.linkText("Sign Up")).click();

		//Clicking on Messenger link
		driver.findElement(By.linkText("Messenger")).click();
		
		
		//Clicking on Facebook lite link 
		driver.findElement(By.xpath("//a[@title='Facebook Lite for Android.']")).click();
	}

}
