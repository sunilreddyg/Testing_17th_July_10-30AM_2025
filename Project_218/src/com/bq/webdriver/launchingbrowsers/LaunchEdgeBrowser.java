package com.bq.webdriver.launchingbrowsers;

import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser 
{

	public static void main(String[] args) 
	{
		
		EdgeDriver edge=new EdgeDriver();
		edge.get("https://flipkart.com");
		System.out.println(edge.getTitle());
		edge.quit();
		
		

	}

}
