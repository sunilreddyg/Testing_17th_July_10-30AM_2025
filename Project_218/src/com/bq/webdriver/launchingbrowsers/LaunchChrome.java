package com.bq.webdriver.launchingbrowsers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChrome 
{


	public static void main(String[] args) 
	{
		
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("https://app.phptravels.com/login");
		String title1=chrome.getTitle();
		System.out.println(title1);
		chrome.quit();
		
		
	
		
		
	}

}
