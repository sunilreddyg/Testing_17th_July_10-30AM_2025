package com.bq.java.Loops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class While_Example {

	public static void main(String[] args) throws Exception {
		
		
		//print numbers 1 to 10 using while loop
		
		int i=0;
		while (i<11) 
		{
			System.out.println(i);
			i=i+1;
		}
		
		
		//Printing numbers 10 to 1 using while loop
		int j=10;
		while(j > 0)
		{
			System.out.println(j);
			j=j-1;
		}
		
		
		
		//Wait until Required title presented
		//While is infinity program here
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		while(true)
		{
			String Run_Title=driver.getTitle();
			System.out.println(Run_Title);
			if(Run_Title.contains("Facebook"))
				break;
		}
		
		
		
		
		
		//Wait until required page title is verified
		//WHile wait maximum 30 Seconds in this program
		WebDriver wd=new ChromeDriver();
		wd.get("http://google.com");
		
		int count=0;
		
		while(true)
		{
			String Run_Title=wd.getTitle();
			System.out.println(Run_Title);
			if(Run_Title.contains("Google"))
				break;
			
	
			count=count+1;
			Thread.sleep(1000);
			if(count==30)
				break;
		}
		

	}

}
