package com.bq.java.Coditions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ELSE_IF {

	public static void main(String[] args) {
		
		
		//Multiple decision statement.
		

		String day="tue";
		
		if(day.equals("mon"))
		{
			System.out.println("Study Java");
		}
		else if (day.equals("tue")) 
		{
			System.out.println("Study Selenium");
		}
		else if (day.equals("sat")) 
		{
			System.out.println("Study framework");
		}
		else
		{
			System.out.println("Not Match found");
		}
		
		
		
		
		String browser="edge";
		WebDriver driver=null;
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
			System.out.println("chrome is up and ready to use");
		}
		else if(browser.equals("firefox"))
		{
			driver=new FirefoxDriver();
			System.out.println("firefox is up and ready to use");
		}
		else if(browser.equals("edge"))
		{
			driver=new EdgeDriver();
			System.out.println("edge is up and ready to use");
		}
		else
		{
			System.out.println("brower name mismatch");
		}
		
		
		
		//Decision to accept when driver is not null
		if (driver != null) 
		{
			driver.get("http://google.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
		
		
		if(driver.getTitle().equals("Google"))
		{
			System.out.println("Title Verified");
			driver.quit();
		}
		else
		{
			System.out.println("WrongTitle Presented");
			driver.quit();
		}
		
		
		

	}

}
