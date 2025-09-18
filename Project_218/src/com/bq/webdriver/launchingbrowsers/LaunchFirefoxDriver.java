package com.bq.webdriver.launchingbrowsers;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxDriver 
{

	public static void main(String[] args) 
	{

		FirefoxDriver firefox=new FirefoxDriver();
		firefox.get("https://amazon.in");
		System.out.println(firefox.getTitle());
		firefox.quit();
		

	}

}
