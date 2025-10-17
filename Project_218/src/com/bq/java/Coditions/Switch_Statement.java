package com.bq.java.Coditions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switch_Statement {

	public static void main(String[] args) {
		
		
		/*
		 * Switch work like else-if condition, It accept
		 * multiple decisions. But only difference is
		 * switch directly check single condition without
		 * Checking every condition...
		 */
		
		String day="sat";
		switch (day) 
		{
		case "mon":
			System.out.println("study java");
			break;

		case "thu":
			System.out.println("study selenium");
			break;
			
		case "sat":
			System.out.println("study framewok");
			break;
			
		default:
			break;
		}
		
		
		
		String browser="chrome";
		WebDriver driver=null;
		switch (browser) {
		case "chrome":
			
			driver=new ChromeDriver();
			System.out.println("Chrome is UP");
			break;
			
		case "firefox":
			driver=new FirefoxDriver();
			System.out.println("firefox is UP");
			break;

		case "edge":
			driver=new EdgeDriver();
			System.out.println("edge is UP");
			break;
			
		default:
			System.out.println("Browser mismatch");
			break;
		}
		
		
		
		
		

	}

}
