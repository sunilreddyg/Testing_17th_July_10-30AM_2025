package com.bq.java.Loops;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CrossBrowser_Test {

	public static void main(String[] args) throws Exception 
	{
		
		
		String browsers[]= {"chrome","edge","firefox"};
		
		for (int i = 2; i < browsers.length; i++) 
		{
			String browsername = browsers[i];
			
			
			WebDriver driver=null;
			switch (browsername) {
			case "chrome":
				driver=new ChromeDriver();
				break;
			
			case "edge":
				driver=new EdgeDriver();
				break;
			case "firefox":
				driver=new FirefoxDriver();
				break;
				
			default:System.out.println("Browser name doesn't match");
				break;
			}
			
			
			
			
			
			//Double dimensinal array
			String footerlinks[]= 
				{
					"Sign Up",
					"Log in",
					"Messenger",
					"Facebook Lite",
					"Video",
					"Meta AI"
				};
			
			
			//Inner loop
			for (int j = 0; j < footerlinks.length; j++) 
			{
				
				String Eachlink = footerlinks[j];
				driver.get("http://facebook.com");
				driver.findElement(By.linkText(Eachlink)).click();
				System.out.println(browsername+"   "+Eachlink+"      "+driver.getTitle());
			}
			
			
		}//End outter loop

	}

}
