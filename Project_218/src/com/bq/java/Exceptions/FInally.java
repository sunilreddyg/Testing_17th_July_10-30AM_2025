package com.bq.java.Exceptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FInally {

	public static void main(String[] args) throws Exception {
		
		
		try {
			//Write Code Here
		} finally {
			//Handle anything you must run
		}
		
		
		try {
			//Try Error Code Here
		} catch (Exception e) {
			//handle erro here
		} finally {
			//Any thing must run
		}
		
		
		
		//Using Webdriver
		WebDriver driver=null;
		try {
			driver=new ChromeDriver();
			driver.get("http://facebook.com");
		} finally {
			Thread.sleep(5000);
			driver.quit();
		}
		
		
		
		
	}

}
