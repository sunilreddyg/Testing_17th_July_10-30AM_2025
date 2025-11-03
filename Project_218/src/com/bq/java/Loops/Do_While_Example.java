package com.bq.java.Loops;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Do_While_Example {

	public static void main(String[] args) throws Exception {
		
		
		//Print number 1 to 10
		
		int i=1;
		do {
			
			System.out.println(i);
			i=i+1;
		} while (i < 11);
		
		
		//Invalid Condition
		int j=10;
		do {
			System.out.println(j);
		} while (j < 0);
		
		
		
		//Wait until Required title is presented
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	
		
		boolean flag=false;
		int count=0;
		do {
			driver.get("https://demowebshop.tricentis.com/");
			
			try {
				wait.until(ExpectedConditions.titleContains("Facebook"));
				flag=true;
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			count=count+1;
			Thread.sleep(1000);
			if(count==5)
				break;
			
			
		} while (flag==false);
		
		
	}

}
